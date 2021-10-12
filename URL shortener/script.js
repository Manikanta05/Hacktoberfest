const btnShort = document.querySelector(".btn-short");
const btnCopy = document.querySelector(".btn-copy");
const container = document.querySelector(".url-shortener-wrapper");
const input = document.querySelector("input");
let shortLink;
let result;

const api = async function (linkArg) {
  try {
    const response = await fetch(
      `https://api.shrtco.de/v2/shorten?url=${linkArg}`
    );
    const data = await response.json();
    result = data;
    shortLink = await data.result.full_short_link;
  } catch (err) {
    console.error(err);
    alert(`${result.error}`);
  }
};

btnShort.addEventListener("click", async function (e) {
  e.preventDefault();
  const link = input.value;
  await api(link);
  if (!result.ok) return;
  input.value = shortLink;
  this.classList.add("hidden");
  btnCopy.classList.remove("hidden");
});

btnCopy.addEventListener("click", async function (e) {
  e.preventDefault();
  await navigator.clipboard.writeText(shortLink);
  this.classList.add("hidden");
  btnShort.classList.remove("hidden");
  input.value = "";
});
