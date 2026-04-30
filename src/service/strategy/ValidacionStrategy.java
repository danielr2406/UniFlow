
package service.strategy;

/**
 * PATRÓN STRATEGY
 * Interfaz para diferentes tipos de validación de login
 */
public interface ValidacionStrategy {
    boolean validar(String usuario, String password);
}