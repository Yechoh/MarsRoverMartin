/**
 * generated by Xtext 2.10.0
 */
package robot;

import robot.DSLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DSLStandaloneSetup extends DSLStandaloneSetupGenerated {
  public static void doSetup() {
    DSLStandaloneSetup _dSLStandaloneSetup = new DSLStandaloneSetup();
    _dSLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
