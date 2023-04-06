package br.com.ifba.modulorh.infrastructure.exception;

/**
 *
 * @author Jonas Dias
 */
public class BusinessException extends RuntimeException {
    
    public BusinessException() {
        super();
    }
    
    public BusinessException(final String mensagem) {
        super(mensagem);
    }

    public BusinessException(final Throwable causa) {
        super(causa);
    }

    public BusinessException(final String mensagem, final Throwable causa) {
        super(mensagem, causa);
    }
    
}