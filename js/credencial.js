const usuario = prompt('usuario');
const contrasenia = prompt('contrasenia');

const usuarioValido = usuario === 'admin';
const contraseniaValida = Number(contrasenia) === 1234;


if (usuarioValido && contraseniaValida) {
    alert('Bienvenido');
}else {
    alert('Usuario o contraseña inválida');
}