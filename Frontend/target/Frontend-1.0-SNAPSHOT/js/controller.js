var app = angular.module('uscnfrontend', []);
app.controller('uscnfrontend', ['$scope','$http', controladorUsuarios]);
        
function controladorUsuarios($scope, $http) {
            var controller = this;
            
            controller.listarUsuarios = function () {
                var url = "http://localhost:8080/Backend/controller/uscnfrontend.jsp";
                var params = {
                    proceso: "listarusuarios"
                };
                $http({
                    method: 'POST',
                    url,
                    params
                }).then(function (res) {
                    console.log(res.data);
                    controller.usuarios = res.data;
                    alert(res.data);
                }).catch(() => alert('Ocurrio un error'));
            };
            
            // Listo los vehiculos al cargar el script
            controller.listarUsuarios();
            
            // cn.guardarContacto = function () {
            //     var contacto = {
            //         proceso: "guardarContacto",
            //         identificacion: cn.identificacion,
            //         nombre: cn.nombre,
            //         apellido: cn.apellido,
            //         genero: cn.genero,
            //         tipoIdentificacion: cn.tipoIdentificacion,
            //         telefono: cn.telefono,
            //         direccion: cn.direccion,
            //         correo: cn.correo
            //     };
                
            //     $http({
            //         method: 'POST',
            //         url: 'Peticiones.jsp',
            //         params: contacto
            //     }).then(function (res) {
            //         if (res.data.ok === true) {
            //             if (res.data[contacto.proceso] === true) {
            //                 cn.listarContactos();
            //                 cn.limpiar();
            //                 alert("Contacto guardado con éxito");
            //             } else {
            //                 alert("Por favor verifique que el identificador no existe y que los datos sean correctos");
            //             }
            //         } else {
            //             alert(res.data.errorMsg);
            //         }
            //     }).catch(() => alert('Ocurrio un error'));

            // };
            
            // cn.eliminarContacto = function (contactToRemove) {
            //     var contacto = {
            //         proceso: "eliminarcontacto",
            //         identificacion: contactToRemove.identificacion
            //     };
            //     $http({
            //         method: 'POST',
            //         url: 'Peticiones.jsp',
            //         params: contacto
            //     }).then(function (res) {
            //         if (res.data.ok === true) {
            //             if (res.data[contacto.proceso] === true) {
            //                 cn.listarContactos();
            //                 alert("Contacto eliminado con éxito");
            //             } else {
            //                 alert("Por favor vefifique sus datos");
            //             }
            //         } else {
            //             alert(res.data.errorMsg);
            //         }
            //     }).catch(() => alert('Ocurrio un error'));

            // };
            
            // cn.actualizarContacto = function () {

            //     var contacto = {
            //         proceso: "actualizarcontacto",
            //         identificacion: cn.identificacion,
            //         nombre: cn.nombre,
            //         apellido: cn.apellido,
            //         genero: cn.genero,
            //         tipoIdentificacion: cn.tipoIdentificacion,
            //         telefono: cn.telefono,
            //         direccion: cn.direccion,
            //         correo: cn.correo
            //     };
                
            //     $http({
            //         method: 'POST',
            //         url: 'Peticiones.jsp',
            //         params: contacto
            //     }).then(function (res) {
            //         if (res.data.ok === true) {
            //             if (res.data[contacto.proceso] === true) {
            //                 cn.listarContactos();
            //                 cn.limpiar();
            //                 alert("Contacto actualizado con éxito");
            //             } else {
            //                 alert("Por favor verifique que el contacto existe y que sus datos son correctos");
            //             }
            //         } else {
            //             alert(res.data.errorMsg);
            //         }
            //     }).catch(() => alert('Ocurrio un error'));

            // };
            
            // cn.consultarPorId = function (contactDetail) {
            //     var contacto = {
            //         proceso: "consultarPorId",
            //         identificacion: contactDetail.identificacion,
            //     };
            //     $http({
            //         method: 'POST',
            //         url: 'Peticiones.jsp',
            //         params: contacto
            //     }).then(function (res) {
            //         if (res.data.ok === true) {
            //             if (res.data[contacto.proceso] === true) {
            //                 const contacto = res.data.contacto;
            //                 cn.identificacion = contacto.identificacion;
            //                 cn.nombre = contacto.nombre;
            //                 cn.apellido = contacto.apellido;
            //                 cn.genero = contacto.genero;
            //                 cn.tipoIdentificacion = contacto.tipoIdentificacion;
            //                 cn.telefono = contacto.telefono;
            //                 cn.direccion = contacto.direccion;
            //                 cn.correo = contacto.correo;
            //             } 
            //         } else {
            //             alert(res.data.errorMsg);
            //         }
            //     }).catch(err => alert('Ocurrio un error'));

            // };
            
            // cn.limpiar = function (){
            //     cn.identificacion = null;
            //     cn.nombre = "";
            //     cn.apellido = "";
            //     cn.genero = "";
            //     cn.tipoIdentificacion = "";
            //     cn.telefono = "";
            //     cn.direccion = "";
            //     cn.correo = "";
                
            //     $scope.frm.$setPristine();
            //     $scope.frm.$setUntouched();
            // }
           
        }