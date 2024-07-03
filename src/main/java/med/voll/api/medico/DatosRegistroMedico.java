package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroMedico(String nombre,
                                  String email,
                                  String documento,
                                  Especialidad especialidad /*Se utilizara un enum por que en el modelo es un dropdown con 4 opciones)*/,
                                  DatosDireccion direccion)  {
}
