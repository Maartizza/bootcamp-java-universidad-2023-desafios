const CostosFijos = Number(prompt('Ingrese el monto de Costos Fijos:'));
const PrecioDeVenta = Number(prompt('Ingrese el precio de venta:'));
const CostosVariables = Number(prompt('Ingrese el monto de los Costos Variables:'));

const PuntoDeEquilibrio = CostosFijos/(PrecioDeVenta - CostosVariables);

 alert(`El Punto de equilibrio es: ${PuntoDeEquilibrio}`);

