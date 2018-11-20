package edu.ksu.cis.bandera.specification.pattern.lexer;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998-2001 SAnToS Laboratories (santos@cis.ksu.edu)  *

 * All rights reserved.                                              *
 *                                                                   *
 * This work was done as a project in the SAnToS Laboratory,         *
 * Department of Computing and Information Sciences, Kansas State    *
 * University, USA (http://www.cis.ksu.edu/santos).                  *
 * It is understood that any modification not identified as such is  *
 * not covered by the preceding statement.                           *
 *                                                                   *
 * This work is free software; you can redistribute it and/or        *
 * modify it under the terms of the GNU Library General Public       *
 * License as published by the Free Software Foundation; either      *
 * version 2 of the License, or (at your option) any later version.  *
 *                                                                   *
 * This work is distributed in the hope that it will be useful,      *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of    *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU *
 * Library General Public License for more details.                  *
 *                                                                   *
 * You should have received a copy of the GNU Library General Public *
 * License along with this toolkit; if not, write to the             *
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,      *
 * Boston, MA  02111-1307, USA.                                      *
 *                                                                   *
 * Java is a trademark of Sun Microsystems, Inc.                     *
 *                                                                   *
 * To submit a bug report, send a comment, or get the latest news on *
 * this project and other SAnToS projects, please visit the web-site *
 *                http://www.cis.ksu.edu/santos                      *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
/* This file was generated by SableCC (http://www.sable.mcgill.ca/sablecc/). */

import java.io.*;
import java.util.*;
import edu.ksu.cis.bandera.specification.pattern.node.*;

public class Lexer
{
	protected Token token;
	protected State state = State.INITIAL;

	private PushbackReader in;
	private int line;
	private int pos;
	private boolean cr;
	private boolean eof;
	private final StringBuffer text = new StringBuffer();

	private static int[][][][] gotoTable;
/*  {
		{ // INITIAL
			{{9, 9, 1}, {10, 10, 2}, {12, 12, 3}, {13, 13, 4}, {32, 32, 5}, {34, 34, 6}, {36, 36, 7}, {43, 43, 8}, {44, 44, 9}, {61, 61, 10}, {65, 90, 11}, {95, 95, 12}, {97, 111, 11}, {112, 112, 13}, {113, 122, 11}, {123, 123, 14}, {125, 125, 15}, },
			{{9, 32, -2}, },
			{{9, 32, -2}, },
			{{9, 32, -2}, },
			{{9, 9, 1}, {10, 10, 16}, {12, 32, -2}, },
			{{9, 32, -2}, },
			{{0, 9, 17}, {11, 12, 17}, {14, 33, 17}, {34, 34, 18}, {35, 91, 17}, {92, 92, 19}, {93, 255, 17}, },
			{{36, 36, 20}, {48, 57, 21}, {65, 90, 22}, {95, 95, 23}, {97, 122, 22}, },
			{},
			{},
			{},
			{{36, 122, -9}, },
			{{36, 122, -9}, },
			{{36, 95, -9}, {97, 97, 24}, {98, 122, 22}, },
			{},
			{},
			{{9, 32, -2}, },
			{{0, 255, -8}, },
			{},
			{{34, 34, 25}, {39, 39, 26}, {48, 51, 27}, {52, 55, 28}, {92, 92, 29}, {98, 98, 30}, {102, 102, 31}, {110, 110, 32}, {114, 114, 33}, {116, 116, 34}, },
			{{36, 122, -9}, },
			{{36, 122, -9}, },
			{{36, 122, -9}, },
			{{36, 122, -9}, },
			{{36, 95, -9}, {97, 115, 22}, {116, 116, 35}, {117, 122, 22}, },
			{{0, 255, -8}, },
			{{0, 255, -8}, },
			{{0, 34, -8}, {35, 47, 17}, {48, 55, 36}, {56, 91, 17}, {92, 255, -8}, },
			{{0, 47, -29}, {48, 55, 37}, {56, 255, -29}, },
			{{0, 255, -8}, },
			{{0, 255, -8}, },
			{{0, 255, -8}, },
			{{0, 255, -8}, },
			{{0, 255, -8}, },
			{{0, 255, -8}, },
			{{36, 115, -26}, {116, 116, 38}, {117, 122, 22}, },
			{{0, 47, -29}, {48, 55, 39}, {56, 255, -29}, },
			{{0, 255, -8}, },
			{{36, 95, -9}, {97, 100, 22}, {101, 101, 40}, {102, 122, 22}, },
			{{0, 255, -8}, },
			{{36, 95, -9}, {97, 113, 22}, {114, 114, 41}, {115, 122, 22}, },
			{{36, 95, -9}, {97, 109, 22}, {110, 110, 42}, {111, 122, 22}, },
			{{36, 122, -9}, },
		}
	};*/

	private static int[][] accept;
/*  {
		// INITIAL
		{0, 0, 0, 0, 0, 0, -1, 8, 4, 3, 5, 8, 8, 8, 1, 2, 0, -1, 7, -1, 8, 8, 8, 8, 8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 8, -1, -1, 8, -1, 8, 8, 6, },

	};*/

	public static class State
	{
		public final static State INITIAL = new State(0);

		private int id;

		private State(int id)
		{
			this.id = id;
		}

		public int id()
		{
			return id;
		}
	}
	public Lexer(PushbackReader in)
	{
		this.in = in;

		if(gotoTable == null)
		{
			try
			{
				DataInputStream s = new DataInputStream(
					new BufferedInputStream(
					Lexer.class.getResourceAsStream("lexer.dat")));

				// read gotoTable
				int length = s.readInt();
				gotoTable = new int[length][][][];
				for(int i = 0; i < gotoTable.length; i++)
				{
					length = s.readInt();
					gotoTable[i] = new int[length][][];
					for(int j = 0; j < gotoTable[i].length; j++)
					{
						length = s.readInt();
						gotoTable[i][j] = new int[length][3];
						for(int k = 0; k < gotoTable[i][j].length; k++)
						{
							for(int l = 0; l < 3; l++)
							{
								gotoTable[i][j][k][l] = s.readInt();
							}
						}
					}
				}

				// read accept
				length = s.readInt();
				accept = new int[length][];
				for(int i = 0; i < accept.length; i++)
				{
					length = s.readInt();
					accept[i] = new int[length];
					for(int j = 0; j < accept[i].length; j++)
					{
						accept[i][j] = s.readInt();
					}
				}

				s.close();
			}
			catch(Exception e)
			{
				throw new RuntimeException("Unable to read lexer.dat.");
			}
		}
	}
	protected void filter() throws LexerException, IOException
	{
	}
	private int getChar() throws IOException
	{
		if(eof)
		{
			return -1;
		}

		int result = in.read();

		if(result == -1)
		{
			eof = true;
		}

		return result;
	}
	private String getText(int acceptLength)
	{
		StringBuffer s = new StringBuffer(acceptLength);
		for(int i = 0; i < acceptLength; i++)
		{
			s.append(text.charAt(i));
		}

		return s.toString();
	}
	protected Token getToken() throws IOException, LexerException
	{
		int dfa_state = 0;

		int start_pos = pos;
		int start_line = line;

		int accept_state = -1;
		int accept_token = -1;
		int accept_length = -1;
		int accept_pos = -1;
		int accept_line = -1;

		int[][][] gotoTable = this.gotoTable[state.id()];
		int[] accept = this.accept[state.id()];
		text.setLength(0);

		while(true)
		{
			int c = getChar();

			if(c != -1)
			{
				switch(c)
				{
				case 10:
					if(cr)
					{
						cr = false;
					}
					else
					{
						line++;
						pos = 0;
					}
					break;
				case 13:
					line++;
					pos = 0;
					cr = true;
					break;
				default:
					pos++;
					cr = false;
					break;
				};

				text.append((char) c);

				do
				{
					int oldState = (dfa_state < -1) ? (-2 -dfa_state) : dfa_state;

					dfa_state = -1;

					int[][] tmp1 =  gotoTable[oldState];
					int low = 0;
					int high = tmp1.length - 1;

					while(low <= high)
					{
						int middle = (low + high) / 2;
						int[] tmp2 = tmp1[middle];

						if(c < tmp2[0])
						{
							high = middle - 1;
						}
						else if(c > tmp2[1])
						{
							low = middle + 1;
						}
						else
						{
							dfa_state = tmp2[2];
							break;
						}
					}
				}while(dfa_state < -1);
			}
			else
			{
				dfa_state = -1;
			}

			if(dfa_state >= 0)
			{
				if(accept[dfa_state] != -1)
				{
					accept_state = dfa_state;
					accept_token = accept[dfa_state];
					accept_length = text.length();
					accept_pos = pos;
					accept_line = line;
				}
			}
			else
			{
				if(accept_state != -1)
				{
					switch(accept_token)
					{
					case 0:
						{
							Token token = new0(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 1:
						{
							Token token = new1(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 2:
						{
							Token token = new2(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 3:
						{
							Token token = new3(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 4:
						{
							Token token = new4(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 5:
						{
							Token token = new5(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 6:
						{
							Token token = new6(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 7:
						{
							Token token = new7(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 8:
						{
							Token token = new8(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					}
				}
				else
				{
					if(text.length() > 0)
					{
						throw new LexerException(
							"[" + (start_line + 1) + "," + (start_pos + 1) + "]" +
							" Unknown token: " + text);
					}
					else
					{
						EOF token = new EOF(
							start_line + 1,
							start_pos + 1);
						return token;
					}
				}
			}
		}
	}
	Token new0(String text, int line, int pos) { return new TWhiteSpace(text, line, pos); }
	Token new1(int line, int pos) { return new TLBrace(line, pos); }
	Token new2(int line, int pos) { return new TRBrace(line, pos); }
	Token new3(int line, int pos) { return new TComma(line, pos); }
	Token new4(int line, int pos) { return new TPlus(line, pos); }
	Token new5(int line, int pos) { return new TEqual(line, pos); }
	Token new6(int line, int pos) { return new TPattern(line, pos); }
	Token new7(String text, int line, int pos) { return new TStringLiteral(text, line, pos); }
	Token new8(String text, int line, int pos) { return new TId(text, line, pos); }
	public Token next() throws LexerException, IOException
	{
		while(token == null)
		{
			token = getToken();
			filter();
		}

		Token result = token;
		token = null;
		return result;
	}
	public Token peek() throws LexerException, IOException
	{
		while(token == null)
		{
			token = getToken();
			filter();
		}

		return token;
	}
	private void pushBack(int acceptLength) throws IOException
	{
		int length = text.length();
		for(int i = length - 1; i >= acceptLength; i--)
		{
			eof = false;

			in.unread(text.charAt(i));
		}
	}
	protected void unread(Token token) throws IOException
	{
		String text = token.getText();
		int length = text.length();

		for(int i = length - 1; i >= 0; i--)
		{
			eof = false;

			in.unread(text.charAt(i));
		}

		pos = token.getPos() - 1;
		line = token.getLine() - 1;
	}
}
