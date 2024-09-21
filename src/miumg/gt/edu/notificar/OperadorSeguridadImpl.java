package miumg.gt.edu.notificar;

public class OperadorSeguridadImpl extends Main.OperadorSeguridad {

    @Override
    public void actualizar(Main.Sensor sensor, String mensaje) {
        System.out.println("Operador de Seguridad notificado: " + mensaje);
    }
}
