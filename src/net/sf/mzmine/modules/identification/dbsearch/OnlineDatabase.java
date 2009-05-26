/*
 * Copyright 2006-2009 The MZmine 2 Development Team
 * 
 * This file is part of MZmine 2.
 * 
 * MZmine 2 is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * MZmine 2 is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * MZmine 2; if not, write to the Free Software Foundation, Inc., 51 Franklin St,
 * Fifth Floor, Boston, MA 02110-1301 USA
 */

package net.sf.mzmine.modules.identification.dbsearch;

import net.sf.mzmine.modules.identification.dbsearch.databases.KEGGGateway;
import net.sf.mzmine.modules.identification.dbsearch.databases.PubChemGateway;

public enum OnlineDatabase {

	KEGG("KEGG Compound database", KEGGGateway.class), 
	PubChem("PubChem Compound database", PubChemGateway.class);

	private final String dbName;
	private final Class<? extends DBGateway> gatewayClass;

	OnlineDatabase(String dbName, Class<? extends DBGateway> gatewayClass) {
		this.dbName = dbName;
		this.gatewayClass = gatewayClass;
	}

	public Class<? extends DBGateway> getGatewayClass() {
		return this.gatewayClass;
	}

	public String toString() {
		return dbName;
	}

}
