package com.cookie.assets20291M;

import com.cookie.BuildingProductionEffect;
import com.cookie.BuildingType;
import com.cookie.SavedCookieClicker;

/**
 * An effect to double building production.
 */
class BuildingProductionDoubler implements BuildingProductionEffect {
  private final BuildingType target;

  /**
   * Create a new targeted building production doubler.
   *
   * @param target The building target of this X2 effect.
   */
  public BuildingProductionDoubler(BuildingType target) {
    this.target = target;
  }

  @Override
  public double getNumber(SavedCookieClicker stats) {
    return 2;
  }

  @Override
  public BuildingType getTarget() {
    return target;
  }

  @Override
  public TERM getTerm() {
    return TERM.MULTIPLIER;
  }
}