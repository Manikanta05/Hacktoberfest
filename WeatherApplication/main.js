document.getElementById("search_button").addEventListener("click", (e) => {
  e.preventDefault();
  var cityName = document.getElementById("city_input").value;
  // Add your api key here 
  // You can get your api key https://openweathermap.org/api

  var APIkey = "";
  fetch(
    `http://api.openweathermap.org/data/2.5/weather?q=${cityName}&appid=${APIkey}`,
    { method: "GET" }
  )
    .then((res) => res.json())
    .then((data)=> {

        let country = data.sys.country;
        let city = data.name;
        let lon = data.coord.lon;
        let lat = data.coord.lat;
        document.getElementById('cityname').innerHTML=`Entered City : ${city}, ${country} <br><br> Location : ${lon} ${lat}`;
       
        
        let weather = data.weather[0].main;
        let description = data.weather[0].description;
        document.getElementById('weather').innerHTML =` Weather Conditions : ${weather}, ${description}`
        
        
        let temperature = data.main.temp;
        let temperature_min = data.main.temp_min;
        let temperature_max = data.main.temp_max;
        document.getElementById('temperature').innerHTML= `Current Temperature : ${temperature} <br><br> Minimum Temperature : ${temperature_min} <br><br> Maximum Temperature : ${temperature_max}`
        
      
    })
    .catch((err) => console.log(err));
});
