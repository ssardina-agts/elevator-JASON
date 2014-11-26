/*
 * Copyright 2003 Neil McKellar and Chris Dailey
 * All rights reserved.
 */
package org.intranet.sim.ui;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.intranet.sim.SimulationApplication;
import org.intranet.sim.Simulator;

/**
 * @author Neil McKellar and Chris Dailey
 *
 */
public class SimulationSelectionDialog
  extends JDialog
{
  /**
   * 
   */
  public SimulationSelectionDialog(JFrame owner, SimulationApplication simApp,
    final SimulationSelection.Listener l)
  {
    super(owner, "Select a Simulation");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    // We need to have a way of disposing the dialog when a simulator is
    // selected.  This listener intercepts the SimulationSelection listener
    // to pass on the event and also add an extra action (dispose this dialog).
    SimulationSelection.Listener newListener = new SimulationSelection.Listener()
    {
      public void simulationSelected(Simulator sim, SimulationApplication app, boolean multiple)
      {
        l.simulationSelected(sim, app, multiple);
        dispose();
      }
    };
    SimulationSelection sel = new SimulationSelection(simApp, newListener);
    getContentPane().add(sel, BorderLayout.CENTER);
    setSize(320, 200);
    setVisible(true);
  }
}
