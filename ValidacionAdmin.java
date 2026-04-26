package uniflow.service.strategy;

/**
 * PATRÓN STRATEGY
 */
public class AuthService {

    private ValidacionStrategy estrategia;

    public void setEstrategia(ValidacionStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public boolean login(String correo, String password) {

        if (estrategia == null) {
            throw new RuntimeException("No hay estrategia definida");
        }

        return estrategia.validar(correo, password);
    }
}