package abilities;

import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;
import heroes.Constants;

public class Drain implements AmplifierByRace {
    public  Drain() {

    }

    @Override
    public final float visit(final Rogue rogue) {
        return Constants.DRAIN_VS_ROGUE;
    }

    @Override
    public final float visit(final Knight knight) {
        return Constants.DRAIN_VS_KNIGHT;
    }

    @Override
    public final float visit(final Pyromancer pyromancer) {
        return Constants.DRAIN_VS_PYRO;
    }

    @Override
    public final float visit(final Wizard wizard) {
        return Constants.DRAIN_VS_WIZARD;
    }
}
