/**************************************************************************
 *  Copyright (C) 2011  Petri Tuononen                                    *
 * 	                                                                      *
 *  This program is free software: you can redistribute it and/or modify  *
 *  it under the terms of the GNU General Public License as published by  *
 *  the Free Software Foundation, either version 3 of the License, or     *
 *  (at your option) any later version.                                   *
 *                                                                        *
 *  This program is distributed in the hope that it will be useful,       *
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *  GNU General Public License for more details.                          *
 *                                                                        *
 *  You should have received a copy of the GNU General Public License     *
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>. *
 **************************************************************************/
package scanner;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Handles input and output file operations. 
 *
 */
public class IOFiles {

	private File inputFile;
	private File outputFile;
	private PrintWriter pw = null;

	public File getInputFile() {
		return inputFile;
	}

	public void setInputFile(File inputFile) {
		this.inputFile = inputFile;
	}

	public File getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(File outputFile) {
		this.outputFile = outputFile;
	}

	public void writeLine(String s) {
		try {
			pw = new PrintWriter(new FileWriter(getOutputFile(), true));
			pw.println(s);
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			//close the PrintWriter
			if (pw != null)
				pw.close();
		}
	}

}
