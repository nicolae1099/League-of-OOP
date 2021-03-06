package abilities;

import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;
import heroes.Constants;

public class Ignite implements AmplifierByRace {
    public Ignite() {

    }
    @Override
    public final float visit(final Rogue rogue) {
        return Constants.IGNITE_VS_ROGUE;
    }

    @Override
    public final float visit(final Knight knight) {
        return Constants.IGNITE_VS_KNIGHT;
    }

    @Override
    public final float visit(final Pyromancer pyromancer) {
        return Constants.IGNITE_VS_PYRO;
    }

    @Override
    public final float visit(final Wizard wizard) {
        return Constants.IGNITE_VS_WIZARD;
    }
}
