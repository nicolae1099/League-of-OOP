package angels;

import heroes.Knight;
import heroes.Pyromancer;
import heroes.Rogue;
import heroes.Wizard;

public final class SmallAngel implements Angel {
    @Override
    public void visit(final Knight knight) {
        knight.angelsRaceMultiplier += Constants.SMALL_ANGEL_VS_KNIGHT_DMG;
        knight.hp = Math.min(knight.maxHp, knight.hp + Constants.SMALL_ANGEL_VS_KNIGHT_HP);
    }

    @Override
    public void visit(final Pyromancer pyromancer) {
        pyromancer.angelsRaceMultiplier += Constants.SMALL_ANGEL_VS_PYRO_DMG;
        pyromancer.hp = Math.min(pyromancer.maxHp,
                pyromancer.hp + Constants.SMALL_ANGEL_VS_PYRO_HP);
    }

    @Override
    public void visit(final Rogue rogue) {
        rogue.angelsRaceMultiplier += Constants.SMALL_ANGEL_VS_ROGUE_DMG;
        rogue.hp = Math.min(rogue.maxHp, rogue.hp + Constants.SMALL_ANGEL_VS_ROGUE_HP);
    }

    @Override
    public void visit(final Wizard wizard) {
        wizard.angelsRaceMultiplier += Constants.SMALL_ANGEL_VS_WIZARD_DMG;
        wizard.hp = Math.min(wizard.maxHp, wizard.hp + Constants.SMALL_ANGEL_VS_KNIGHT_HP);
    }
}
