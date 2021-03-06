package angels;

import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public final class Spawner implements Angel {
    @Override
    public void visit(final Knight knight) {
        if (!knight.isAlive()) {
            knight.hp = Constants.SPAWNER_VS_KNIGHT_HP;
        }
    }

    @Override
    public void visit(final Pyromancer pyromancer) {
        if (!pyromancer.isAlive()) {
            pyromancer.hp = Constants.SPAWNER_VS_PYRO_HP;
        }
    }

    @Override
    public void visit(final Rogue rogue) {
        if (!rogue.isAlive()) {
            rogue.hp = Constants.SPAWNER_VS_ROGUE_HP;
        }
    }

    @Override
    public void visit(final Wizard wizard) {
        if (!wizard.isAlive()) {
            wizard.hp = Constants.SPAWNER_VS_WIZARD_HP;
        }
    }
}
