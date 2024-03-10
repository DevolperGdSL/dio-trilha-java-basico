package estabelecimento;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;
import multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
