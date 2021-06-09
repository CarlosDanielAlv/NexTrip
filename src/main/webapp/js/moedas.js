const moedaT = fetch("https://economia.awesomeapi.com.br/last/USD-TND")
  .then(response => {
return response.json();
})
  .then(jsonBody => {
document.querySelector("#valorT").innerHTML = jsonBody.USDTND.high;
    console.log(jsonBody);
  }); 
const moedaC = fetch("https://economia.awesomeapi.com.br/last/USD-CUP")
  .then(response => {
return response.json();
})
  .then(jsonBody => {
document.querySelector("#valorC").innerHTML = jsonBody.USDCUP.high;
    console.log(jsonBody);
  }); 
  const moedaTK = fetch("https://economia.awesomeapi.com.br/last/BRL-TRY")
  .then(response => {
return response.json();
})
  .then(jsonBody => {
document.querySelector("#valorTK").innerHTML = jsonBody.BRLTRY.high;
    console.log(jsonBody);
  }); 
  const moedaE = fetch("https://economia.awesomeapi.com.br/last/BRL-EGP")
  .then(response => {
return response.json();
})
  .then(jsonBody => {
document.querySelector("#valorE").innerHTML = jsonBody.BRLEGP.high;
    console.log(jsonBody);
  }); 
    const moedaA = fetch("https://economia.awesomeapi.com.br/last/EUR-ALL")
  .then(response => {
return response.json();
})
  .then(jsonBody => {
document.querySelector("#valorA").innerHTML = jsonBody.EURALL.high;
    console.log(jsonBody);
  }); 