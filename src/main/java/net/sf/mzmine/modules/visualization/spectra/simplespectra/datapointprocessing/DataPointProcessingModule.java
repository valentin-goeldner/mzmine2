/*
 * Copyright 2006-2018 The MZmine 2 Development Team
 * 
 * This file is part of MZmine 2.
 * 
 * MZmine 2 is free software; you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 * 
 * MZmine 2 is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with MZmine 2; if not,
 * write to the Free Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301
 * USA
 */

package net.sf.mzmine.modules.visualization.spectra.simplespectra.datapointprocessing;

import javax.annotation.Nonnull;
import net.sf.mzmine.datamodel.DataPoint;
import net.sf.mzmine.modules.MZmineModule;
import net.sf.mzmine.modules.visualization.spectra.simplespectra.SpectraPlot;
import net.sf.mzmine.modules.visualization.spectra.simplespectra.datapointprocessing.datamodel.MSLevel;
import net.sf.mzmine.modules.visualization.spectra.simplespectra.datapointprocessing.datamodel.ModuleSubCategory;
import net.sf.mzmine.parameters.ParameterSet;
import net.sf.mzmine.taskcontrol.TaskStatusListener;

/**
 * 
 * @author SteffenHeu steffen.heuckeroth@gmx.de / s_heuc03@uni-muenster.de
 *
 */
public interface DataPointProcessingModule extends MZmineModule {

  /**
   * @return The module sub category of this module.
   */
  @Nonnull
  public ModuleSubCategory getModuleSubCategory();

  @Nonnull
  public DataPointProcessingTask createTask(DataPoint[] dataPoints, ParameterSet parameterSet,
      SpectraPlot plot, DataPointProcessingController controller, TaskStatusListener listener);
  
  @Nonnull
  public MSLevel getApplicableMSLevel();

}
