import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailTest {

    @Test
    public void deveRetornarEmail() {
        Email.getInstance().setUsuarioEmail("lara@gmail.com");
        assertEquals("lara@gmail.com", Email.getInstance().getUsuarioEmail());
    }

    @Test
    public void deveRetornarCodigoConfirmacao() {
        Email.getInstance().setCodigoConfirmacao("Codigo");
        assertEquals("Codigo", Email.getInstance().getCodigoConfirmacao());
    }

}
