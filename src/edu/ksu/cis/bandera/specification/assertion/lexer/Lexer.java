package edu.ksu.cis.bandera.specification.assertion.lexer;

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
import edu.ksu.cis.bandera.specification.assertion.node.*;

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
			{{9, 9, 1}, {10, 10, 2}, {12, 12, 3}, {13, 13, 4}, {32, 32, 5}, {36, 36, 6}, {46, 46, 7}, {47, 47, 8}, {58, 58, 9}, {59, 59, 10}, {65, 75, 11}, {76, 76, 12}, {77, 79, 11}, {80, 80, 13}, {81, 90, 11}, {91, 91, 14}, {93, 93, 15}, {95, 95, 16}, {97, 122, 11}, },
			{{9, 32, -2}, },
			{{9, 32, -2}, },
			{{9, 32, -2}, },
			{{9, 9, 1}, {10, 10, 17}, {12, 32, -2}, },
			{{9, 32, -2}, },
			{{36, 36, 18}, {48, 57, 19}, {65, 90, 20}, {95, 95, 21}, {97, 122, 20}, },
			{},
			{{42, 42, 22}, {47, 47, 23}, },
			{},
			{},
			{{36, 122, -8}, },
			{{36, 57, -8}, {65, 78, 20}, {79, 79, 24}, {80, 90, 20}, {95, 122, -8}, },
			{{36, 78, -14}, {79, 79, 25}, {80, 81, 20}, {82, 82, 26}, {83, 90, 20}, {95, 122, -8}, },
			{},
			{},
			{{36, 122, -8}, },
			{{9, 32, -2}, },
			{{36, 122, -8}, },
			{{36, 122, -8}, },
			{{36, 122, -8}, },
			{{36, 122, -8}, },
			{{0, 9, 27}, {10, 10, 28}, {11, 12, 27}, {13, 13, 29}, {14, 41, 27}, {42, 42, 30}, {43, 255, 27}, },
			{{0, 9, 31}, {10, 10, 32}, {11, 12, 31}, {13, 13, 33}, {14, 255, 31}, },
			{{36, 57, -8}, {65, 66, 20}, {67, 67, 34}, {68, 90, 20}, {95, 122, -8}, },
			{{36, 57, -8}, {65, 82, 20}, {83, 83, 35}, {84, 90, 20}, {95, 122, -8}, },
			{{36, 57, -8}, {65, 68, 20}, {69, 69, 36}, {70, 90, 20}, {95, 122, -8}, },
			{{0, 41, -24}, {42, 42, 37}, {43, 255, 27}, },
			{{0, 255, -29}, },
			{{0, 9, 27}, {10, 10, 38}, {11, 255, -29}, },
			{{0, 9, 39}, {10, 10, 40}, {11, 12, 39}, {13, 13, 41}, {14, 41, 39}, {42, 42, 42}, {43, 46, 39}, {47, 47, 43}, {48, 255, 39}, },
			{{0, 255, -25}, },
			{},
			{{10, 10, 44}, },
			{{36, 57, -8}, {65, 65, 45}, {66, 90, 20}, {95, 122, -8}, },
			{{36, 57, -8}, {65, 83, 20}, {84, 84, 46}, {85, 90, 20}, {95, 122, -8}, },
			{{36, 122, -8}, },
			{{0, 9, 47}, {10, 10, 48}, {11, 12, 47}, {13, 13, 49}, {14, 41, 47}, {42, 42, 37}, {43, 46, 47}, {47, 47, 50}, {48, 255, 47}, },
			{{0, 255, -29}, },
			{{0, 9, 51}, {10, 10, 52}, {11, 12, 51}, {13, 13, 53}, {14, 41, 51}, {42, 42, 54}, {43, 255, 51}, },
			{{0, 255, -41}, },
			{{0, 9, 51}, {10, 10, 55}, {11, 255, -41}, },
			{{0, 255, -32}, },
			{},
			{},
			{{36, 83, -37}, {84, 84, 56}, {85, 122, -37}, },
			{{36, 122, -8}, },
			{{0, 9, 57}, {10, 10, 58}, {11, 12, 57}, {13, 13, 59}, {14, 41, 57}, {42, 42, 60}, {43, 255, 57}, },
			{{0, 255, -49}, },
			{{0, 9, 57}, {10, 10, 61}, {11, 255, -49}, },
			{},
			{{0, 255, -41}, },
			{{0, 255, -41}, },
			{{0, 9, 51}, {10, 10, 62}, {11, 255, -41}, },
			{{0, 41, -32}, {42, 42, 54}, {43, 255, -32}, },
			{{0, 255, -41}, },
			{{36, 57, -8}, {65, 72, 20}, {73, 73, 63}, {74, 90, 20}, {95, 122, -8}, },
			{{0, 255, -49}, },
			{{0, 255, -49}, },
			{{0, 9, 57}, {10, 10, 64}, {11, 255, -49}, },
			{{0, 41, -39}, {42, 42, 60}, {43, 255, -39}, },
			{{0, 255, -49}, },
			{{0, 255, -41}, },
			{{36, 78, -14}, {79, 79, 65}, {80, 122, -14}, },
			{{0, 255, -49}, },
			{{36, 57, -8}, {65, 77, 20}, {78, 78, 66}, {79, 90, 20}, {95, 122, -8}, },
			{{36, 122, -8}, },
		}
	};*/

	private static int[][] accept;
/*  {
		// INITIAL
		{0, 0, 0, 0, 0, 0, 12, 8, -1, 6, 7, 12, 12, 12, 4, 5, 12, 0, 12, 12, 12, 12, -1, 3, 12, 12, 12, -1, -1, -1, -1, 3, 3, 3, 12, 12, 9, -1, -1, -1, -1, -1, -1, 2, 3, 12, 10, -1, -1, -1, 1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, 12, -1, 12, 11, },

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
								getText(accept_length),
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
								getText(accept_length),
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
								getText(accept_length),
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
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 9:
						{
							Token token = new9(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 10:
						{
							Token token = new10(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 11:
						{
							Token token = new11(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 12:
						{
							Token token = new12(
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
	Token new1(String text, int line, int pos) { return new TTraditionalComment(text, line, pos); }
	Token new10(int line, int pos) { return new TPost(line, pos); }
	Token new11(int line, int pos) { return new TLocation(line, pos); }
	Token new12(String text, int line, int pos) { return new TId(text, line, pos); }
	Token new2(String text, int line, int pos) { return new TDocumentationComment(text, line, pos); }
	Token new3(String text, int line, int pos) { return new TEndOfLineComment(text, line, pos); }
	Token new4(int line, int pos) { return new TLBracket(line, pos); }
	Token new5(int line, int pos) { return new TRBracket(line, pos); }
	Token new6(int line, int pos) { return new TColon(line, pos); }
	Token new7(int line, int pos) { return new TSemicolon(line, pos); }
	Token new8(int line, int pos) { return new TDot(line, pos); }
	Token new9(int line, int pos) { return new TPre(line, pos); }
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
