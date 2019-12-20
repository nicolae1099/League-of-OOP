package abilities;

import hero.Knight;
import hero.Pyromancer;
import hero.Rogue;
import hero.Wizard;
import hero.Constants;

public class Deflect implements AmplifierByRace {
    public Deflect() {

    }
    @Override
    public final float visit(final Rogue rogue) {
        return Constants.DEFLECT_VS_ROGUE;
    }

    @Override
    public final float visit(final Knight knight) {
        return Constants.DEFLECT_VS_KNIGHT;
    }

    @Override
    public final float visit(final Pyromancer pyromancer) {
        return Constants.DEFLECT_VS_PYRO;
    }

    @Override
    public final float visit(final Wizard wizard) {
        return Constants.DEFLECT_VS_WIZARD;
    }
}