let datos = [
    {
        mes: "Enero",
        ingresos: 1800,
        gastos: 1500
    },
    {
        mes: "Febrero",
        ingresos: 2500,
        gastos: 2500
    },
    {
        mes: "Marzo",
        ingresos: 84683,
        gastos: 11557
    },
    {
        mes: "Abril",
        ingresos: 135353,
        gastos: 1533
    },
    {
        mes: "Mayo",
        ingresos: 1535,
        gastos: 5434
    },
    {
        mes: "Junio",
        ingresos: 4343354,
        gastos: 5434543
    },
    {
        mes: "Julio",
        ingresos: 435453,
        gastos: 4543
    },
    {
        mes: "Agosto",
        ingresos: 78351,
        gastos: 7816
    },
    {
        mes: "Septiembre",
        ingresos: 1878,
        gastos: 95634
    },
    {
        mes: "Octubre",
        ingresos: 48483,
        gastos: 9433
    },
    {
        mes: "Noviembre",
        ingresos: 35483,
        gastos: 53133
    },
    {
        mes: "Diciembre",
        ingresos: 3843,
        gastos: 348133
    }
  ]

let flujoCaja = datos.map(datos => {
    let flujo = (datos.ingresos - datos.gastos);
    if ((flujo) <= 0){
        document.writeln(`<br/> Mes: ${datos.mes} Ingresos: $ ${datos.ingresos} Gastos: $ ${datos.gastos}
        Resultado Pérdida: $ ${flujo}`);
    }
    else 
        document.writeln(`<br/> Mes: ${datos.mes} Ingresos: $ ${datos.ingresos} Gastos: $ ${datos.gastos}
        Resultado Ganancia: $ ${flujo}`);
    }
);

