let planes = [
    {
      nombre: "Plan 001",
      capital: 150000,
      dias: 30,
      tasa: 15/100
    },
    {
      nombre: "Plan 002",
      capital: 300000,
      dias: 180,
      tasa: 10/100
    },
    {
      nombre: "Plan 003",
      capital: 485000,
      dias: 60,
      tasa: 23/100
    }
      
  ]

let calculoInteres = planes.map(planes => {
    let calculoGenerado = (planes.capital*planes.dias*planes.tasa)/360;
        document.writeln(`<br/> Nombre: ${planes.nombre} Interes Generado: $ ${calculoGenerado} `);
});


