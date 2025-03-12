package reromerot.demos.enums;

import lombok.Getter;

@Getter
public enum Exceptions {

    LOGIN_FAIL("Se esperaba el texto: \"%s\" en lugar de \"%s\"");

    final String textoExepcion;

    Exceptions(String textoExepcion) {
        this.textoExepcion = textoExepcion;
    }

}
