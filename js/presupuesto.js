const IngresosTotales = Number(prompt('Ingrese el monto de Ingresos Totales:'));

const GastosNecesarios = IngresosTotales*0.50;
const GastosOpcionales = IngresosTotales*0.30;
const AhorroInversion = IngresosTotales*0.20;

 alert("Para Gastos Necesarios tiene: $" + GastosNecesarios); 
 alert("Para Gastos Opcionales tiene: $" + GastosOpcionales);
 alert("Para Ahorro e Inversión tiene: $" + AhorroInversion);

 