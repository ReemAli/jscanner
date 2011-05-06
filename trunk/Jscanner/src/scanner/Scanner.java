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

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Scanner {

	//global variables
	private static IOFiles files;
	private char current = ' ';

	/**
	 * Main.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length > 0 ) {
			files.setInputFile(new File(args[0]));
		}

	}

	/**
	 * Constructor.
	 */
	public Scanner() {

	}

	/***
	 * Read next character from the file.
	 */
	public void readNextChar() {
		try {
			FileInputStream fin = new FileInputStream(files.getInputFile());
			DataInputStream din = new DataInputStream(fin);

			//read in next char
			current = din.readChar();

			//close DataInputStream
			din.close();
		}
		catch(FileNotFoundException fe) {
			System.out.println("FileNotFoundException : " + fe);
		}
		catch(IOException ioe) {
			System.out.println("IOException : " + ioe);
		}
	}

}
