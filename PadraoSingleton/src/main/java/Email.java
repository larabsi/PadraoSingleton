public class Email {

    private Email() {};
    private static Email instance = new Email();
    public static Email getInstance() {
        return instance;
    }

    private String usuarioEmail;
    private String codigoConfirmacao;


    public String getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public String getCodigoConfirmacao() {
        return codigoConfirmacao;
    }

    public void setCodigoConfirmacao(String codigoConfirmacao) {
        this.codigoConfirmacao = codigoConfirmacao;
    }
}