package edu.ksu.cis.bandera.specification.predicate.lexer;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.io.*;
import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.node.*;

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
			{{9, 9, 1}, {10, 10, 2}, {12, 12, 3}, {13, 13, 4}, {32, 32, 5}, {33, 33, 6}, {34, 34, 7}, {36, 36, 8}, {37, 37, 9}, {38, 38, 10}, {39, 39, 11}, {40, 40, 12}, {41, 41, 13}, {42, 42, 14}, {43, 43, 15}, {44, 44, 16}, {45, 45, 17}, {46, 46, 18}, {47, 47, 19}, {48, 48, 20}, {49, 57, 21}, {58, 58, 22}, {59, 59, 23}, {60, 60, 24}, {61, 61, 25}, {62, 62, 26}, {63, 63, 27}, {65, 68, 28}, {69, 69, 29}, {70, 72, 28}, {73, 73, 30}, {74, 75, 28}, {76, 76, 31}, {77, 81, 28}, {82, 82, 32}, {83, 90, 28}, {91, 91, 33}, {93, 93, 34}, {94, 94, 35}, {95, 95, 36}, {97, 97, 28}, {98, 98, 37}, {99, 99, 38}, {100, 100, 39}, {101, 101, 28}, {102, 102, 40}, {103, 104, 28}, {105, 105, 41}, {106, 107, 28}, {108, 108, 42}, {109, 109, 28}, {110, 110, 43}, {111, 114, 28}, {115, 115, 44}, {116, 116, 45}, {117, 122, 28}, {123, 123, 46}, {124, 124, 47}, {125, 125, 48}, {126, 126, 49}, },
			{{9, 32, -2}, },
			{{9, 32, -2}, },
			{{9, 32, -2}, },
			{{9, 9, 1}, {10, 10, 50}, {12, 32, -2}, },
			{{9, 32, -2}, },
			{{61, 61, 51}, },
			{{0, 9, 52}, {11, 12, 52}, {14, 33, 52}, {34, 34, 53}, {35, 91, 52}, {92, 92, 54}, {93, 255, 52}, },
			{{36, 36, 55}, {48, 57, 56}, {65, 90, 57}, {95, 95, 58}, {97, 113, 57}, {114, 114, 59}, {115, 115, 57}, {116, 116, 60}, {117, 122, 57}, },
			{{37, 37, 61}, },
			{{38, 38, 62}, },
			{{0, 9, 63}, {11, 12, 63}, {14, 38, 63}, {40, 91, 63}, {92, 92, 64}, {93, 255, 63}, },
			{},
			{},
			{},
			{},
			{},
			{},
			{{48, 57, 65}, },
			{{42, 42, 66}, {47, 47, 67}, {124, 124, 68}, },
			{{46, 46, 69}, {48, 55, 70}, {56, 57, 71}, {69, 69, 72}, {70, 70, 73}, {76, 76, 74}, {88, 88, 75}, {101, 101, 76}, {102, 102, 77}, {108, 108, 78}, {120, 120, 79}, },
			{{46, 46, 69}, {48, 57, 80}, {69, 76, -22}, {101, 108, -22}, },
			{},
			{},
			{{60, 60, 81}, {61, 61, 82}, },
			{{61, 61, 83}, },
			{{61, 61, 84}, {62, 62, 85}, },
			{},
			{{36, 95, -10}, {97, 122, 57}, },
			{{36, 57, -10}, {65, 87, 57}, {88, 88, 86}, {89, 90, 57}, {95, 122, -30}, },
			{{36, 57, -10}, {65, 77, 57}, {78, 78, 87}, {79, 90, 57}, {95, 122, -30}, },
			{{36, 57, -10}, {65, 78, 57}, {79, 79, 88}, {80, 90, 57}, {95, 122, -30}, },
			{{36, 57, -10}, {65, 68, 57}, {69, 69, 89}, {70, 90, 57}, {95, 122, -30}, },
			{{93, 93, 90}, },
			{},
			{},
			{{36, 122, -30}, },
			{{36, 95, -10}, {97, 110, 57}, {111, 111, 91}, {112, 120, 57}, {121, 121, 92}, {122, 122, 57}, },
			{{36, 95, -10}, {97, 103, 57}, {104, 104, 93}, {105, 122, 57}, },
			{{36, 110, -39}, {111, 111, 94}, {112, 122, 57}, },
			{{36, 95, -10}, {97, 97, 95}, {98, 107, 57}, {108, 108, 96}, {109, 122, 57}, },
			{{36, 95, -10}, {97, 109, 57}, {110, 110, 97}, {111, 122, 57}, },
			{{36, 110, -39}, {111, 111, 98}, {112, 122, 57}, },
			{{36, 95, -10}, {97, 116, 57}, {117, 117, 99}, {118, 122, 57}, },
			{{36, 103, -40}, {104, 104, 100}, {105, 122, 57}, },
			{{36, 103, -40}, {104, 104, 101}, {105, 113, 57}, {114, 114, 102}, {115, 122, 57}, },
			{},
			{{124, 124, 103}, },
			{},
			{},
			{{9, 32, -2}, },
			{},
			{{0, 255, -9}, },
			{},
			{{34, 34, 104}, {39, 39, 105}, {48, 51, 106}, {52, 55, 107}, {92, 92, 108}, {98, 98, 109}, {102, 102, 110}, {110, 110, 111}, {114, 114, 112}, {116, 116, 113}, },
			{{36, 122, -30}, },
			{{36, 122, -30}, },
			{{36, 122, -30}, },
			{{36, 122, -30}, },
			{{36, 95, -10}, {97, 100, 57}, {101, 101, 114}, {102, 122, 57}, },
			{{36, 103, -40}, {104, 104, 115}, {105, 122, 57}, },
			{},
			{},
			{{39, 39, 116}, },
			{{34, 34, 117}, {39, 39, 118}, {48, 51, 119}, {52, 55, 120}, {92, 92, 121}, {98, 98, 122}, {102, 102, 123}, {110, 110, 124}, {114, 114, 125}, {116, 116, 126}, },
			{{48, 57, 65}, {69, 69, 127}, {70, 70, 128}, {101, 101, 129}, {102, 102, 130}, },
			{{0, 9, 131}, {10, 10, 132}, {11, 12, 131}, {13, 13, 133}, {14, 41, 131}, {42, 42, 134}, {43, 255, 131}, },
			{{0, 9, 135}, {10, 10, 136}, {11, 12, 135}, {13, 13, 137}, {14, 255, 135}, },
			{},
			{{48, 57, 138}, {69, 69, 139}, {70, 70, 140}, {101, 101, 141}, {102, 102, 142}, },
			{{46, 70, -22}, {76, 76, 143}, {101, 102, -22}, {108, 108, 144}, },
			{{46, 46, 69}, {48, 57, 71}, {69, 70, -22}, {101, 102, -22}, },
			{{43, 43, 145}, {45, 45, 146}, {48, 57, 147}, },
			{},
			{},
			{{48, 57, 148}, {65, 70, 149}, {97, 102, 150}, },
			{{43, 57, -74}, },
			{},
			{},
			{{48, 102, -77}, },
			{{46, 108, -23}, },
			{},
			{},
			{},
			{},
			{{62, 62, 151}, },
			{{36, 57, -10}, {65, 79, 57}, {80, 80, 152}, {81, 90, 57}, {95, 122, -30}, },
			{{36, 57, -10}, {65, 85, 57}, {86, 86, 153}, {87, 90, 57}, {95, 122, -30}, },
			{{36, 57, -10}, {65, 66, 57}, {67, 67, 154}, {68, 90, 57}, {95, 122, -30}, },
			{{36, 57, -10}, {65, 83, 57}, {84, 84, 155}, {85, 90, 57}, {95, 122, -30}, },
			{},
			{{36, 110, -39}, {111, 111, 156}, {112, 122, 57}, },
			{{36, 95, -10}, {97, 115, 57}, {116, 116, 157}, {117, 122, 57}, },
			{{36, 95, -10}, {97, 97, 158}, {98, 122, 57}, },
			{{36, 116, -45}, {117, 117, 159}, {118, 122, 57}, },
			{{36, 95, -10}, {97, 107, 57}, {108, 108, 160}, {109, 122, 57}, },
			{{36, 110, -39}, {111, 111, 161}, {112, 122, 57}, },
			{{36, 95, -10}, {97, 114, 57}, {115, 115, 162}, {116, 116, 163}, {117, 122, 57}, },
			{{36, 109, -43}, {110, 110, 164}, {111, 122, 57}, },
			{{36, 107, -97}, {108, 108, 165}, {109, 122, 57}, },
			{{36, 110, -39}, {111, 111, 166}, {112, 122, 57}, },
			{{36, 95, -10}, {97, 104, 57}, {105, 105, 167}, {106, 122, 57}, },
			{{36, 116, -45}, {117, 117, 168}, {118, 122, 57}, },
			{},
			{{0, 255, -9}, },
			{{0, 255, -9}, },
			{{0, 34, -9}, {35, 47, 52}, {48, 55, 169}, {56, 91, 52}, {92, 255, -9}, },
			{{0, 47, -108}, {48, 55, 170}, {56, 255, -108}, },
			{{0, 255, -9}, },
			{{0, 255, -9}, },
			{{0, 255, -9}, },
			{{0, 255, -9}, },
			{{0, 255, -9}, },
			{{0, 255, -9}, },
			{{36, 115, -94}, {116, 116, 171}, {117, 122, 57}, },
			{{36, 113, -10}, {114, 114, 172}, {115, 122, 57}, },
			{},
			{{39, 39, 116}, },
			{{39, 39, 116}, },
			{{39, 39, 116}, {48, 55, 173}, },
			{{39, 39, 116}, {48, 55, 174}, },
			{{39, 39, 116}, },
			{{39, 39, 116}, },
			{{39, 39, 116}, },
			{{39, 39, 116}, },
			{{39, 39, 116}, },
			{{39, 39, 116}, },
			{{43, 43, 175}, {45, 45, 176}, {48, 57, 177}, },
			{},
			{{43, 57, -129}, },
			{},
			{{0, 41, -68}, {42, 42, 178}, {43, 255, 131}, },
			{{0, 255, -133}, },
			{{0, 9, 131}, {10, 10, 179}, {11, 255, -133}, },
			{{0, 9, 180}, {10, 10, 181}, {11, 12, 180}, {13, 13, 182}, {14, 41, 180}, {42, 42, 183}, {43, 46, 180}, {47, 47, 184}, {48, 255, 180}, },
			{{0, 255, -69}, },
			{},
			{{10, 10, 185}, },
			{{48, 102, -71}, },
			{{43, 43, 186}, {45, 45, 187}, {48, 57, 188}, },
			{},
			{{43, 57, -141}, },
			{},
			{},
			{},
			{{48, 57, 147}, },
			{{48, 57, 147}, },
			{{48, 57, 147}, {70, 70, 189}, {102, 102, 190}, },
			{{48, 70, -77}, {76, 76, 191}, {97, 102, 150}, {108, 108, 192}, },
			{{48, 108, -150}, },
			{{48, 108, -150}, },
			{},
			{{36, 122, -30}, },
			{{36, 78, -33}, {79, 79, 193}, {80, 122, -33}, },
			{{36, 57, -10}, {65, 65, 194}, {66, 90, 57}, {95, 122, -30}, },
			{{36, 57, -10}, {65, 84, 57}, {85, 85, 195}, {86, 90, 57}, {95, 122, -30}, },
			{{36, 107, -97}, {108, 108, 196}, {109, 122, 57}, },
			{{36, 100, -61}, {101, 101, 197}, {102, 122, 57}, },
			{{36, 113, -10}, {114, 114, 198}, {115, 122, 57}, },
			{{36, 95, -10}, {97, 97, 57}, {98, 98, 199}, {99, 122, 57}, },
			{{36, 114, -99}, {115, 115, 200}, {116, 122, 57}, },
			{{36, 95, -10}, {97, 97, 201}, {98, 122, 57}, },
			{{36, 115, -94}, {116, 116, 202}, {117, 122, 57}, },
			{{36, 122, -30}, },
			{{36, 95, -10}, {97, 102, 57}, {103, 103, 203}, {104, 122, 57}, },
			{{36, 107, -97}, {108, 108, 204}, {109, 122, 57}, },
			{{36, 113, -10}, {114, 114, 205}, {115, 122, 57}, },
			{{36, 114, -99}, {115, 115, 206}, {116, 122, 57}, },
			{{36, 100, -61}, {101, 101, 207}, {102, 122, 57}, },
			{{0, 47, -108}, {48, 55, 208}, {56, 255, -108}, },
			{{0, 255, -9}, },
			{{36, 122, -30}, },
			{{36, 100, -61}, {101, 101, 209}, {102, 122, 57}, },
			{{39, 39, 116}, {48, 55, 210}, },
			{{39, 39, 116}, },
			{{48, 57, 177}, },
			{{48, 57, 177}, },
			{{48, 57, 177}, {70, 70, 128}, {102, 102, 130}, },
			{{0, 9, 211}, {10, 10, 212}, {11, 12, 211}, {13, 13, 213}, {14, 41, 211}, {42, 42, 178}, {43, 46, 211}, {47, 47, 214}, {48, 255, 211}, },
			{{0, 255, -133}, },
			{{0, 9, 215}, {10, 10, 216}, {11, 12, 215}, {13, 13, 217}, {14, 41, 215}, {42, 42, 218}, {43, 255, 215}, },
			{{0, 255, -182}, },
			{{0, 9, 215}, {10, 10, 219}, {11, 255, -182}, },
			{{0, 255, -136}, },
			{},
			{},
			{{48, 57, 188}, },
			{{48, 57, 188}, },
			{{48, 57, 188}, {70, 70, 140}, {102, 102, 142}, },
			{},
			{},
			{},
			{},
			{{36, 57, -10}, {65, 74, 57}, {75, 75, 220}, {76, 90, 57}, {95, 122, -30}, },
			{{36, 83, -91}, {84, 84, 221}, {85, 122, -91}, },
			{{36, 57, -10}, {65, 81, 57}, {82, 82, 222}, {83, 90, 57}, {95, 122, -30}, },
			{{36, 100, -61}, {101, 101, 223}, {102, 122, 57}, },
			{{36, 122, -30}, },
			{{36, 122, -30}, },
			{{36, 107, -97}, {108, 108, 224}, {109, 122, 57}, },
			{{36, 100, -61}, {101, 101, 225}, {102, 122, 57}, },
			{{36, 115, -94}, {116, 116, 226}, {117, 122, 57}, },
			{{36, 95, -10}, {97, 97, 227}, {98, 122, 57}, },
			{{36, 122, -30}, },
			{{36, 122, -30}, },
			{{36, 115, -94}, {116, 116, 228}, {117, 122, 57}, },
			{{36, 122, -30}, },
			{{36, 122, -30}, },
			{{0, 255, -9}, },
			{{36, 95, -10}, {97, 97, 229}, {98, 122, 57}, },
			{{39, 39, 116}, },
			{{0, 9, 230}, {10, 10, 231}, {11, 12, 230}, {13, 13, 232}, {14, 41, 230}, {42, 42, 233}, {43, 255, 230}, },
			{{0, 255, -213}, },
			{{0, 9, 230}, {10, 10, 234}, {11, 255, -213}, },
			{},
			{{0, 255, -182}, },
			{{0, 255, -182}, },
			{{0, 9, 215}, {10, 10, 235}, {11, 255, -182}, },
			{{0, 41, -136}, {42, 42, 218}, {43, 255, -136}, },
			{{0, 255, -182}, },
			{{36, 68, -34}, {69, 69, 236}, {70, 122, -34}, },
			{{36, 57, -10}, {65, 72, 57}, {73, 73, 237}, {74, 90, 57}, {95, 122, -30}, },
			{{36, 77, -32}, {78, 78, 238}, {79, 122, -32}, },
			{{36, 95, -10}, {97, 97, 239}, {98, 122, 57}, },
			{{36, 100, -61}, {101, 101, 240}, {102, 122, 57}, },
			{{36, 122, -30}, },
			{{36, 122, -30}, },
			{{36, 109, -43}, {110, 110, 241}, {111, 122, 57}, },
			{{36, 122, -30}, },
			{{36, 95, -10}, {97, 99, 57}, {100, 100, 242}, {101, 122, 57}, },
			{{0, 255, -213}, },
			{{0, 255, -213}, },
			{{0, 9, 230}, {10, 10, 243}, {11, 255, -213}, },
			{{0, 41, -180}, {42, 42, 233}, {43, 255, -180}, },
			{{0, 255, -213}, },
			{{0, 255, -182}, },
			{{36, 122, -30}, },
			{{36, 78, -33}, {79, 79, 244}, {80, 122, -33}, },
			{{36, 122, -30}, },
			{{36, 109, -43}, {110, 110, 245}, {111, 122, 57}, },
			{{36, 122, -30}, },
			{{36, 95, -10}, {97, 98, 57}, {99, 99, 246}, {100, 122, 57}, },
			{{36, 122, -30}, },
			{{0, 255, -213}, },
			{{36, 77, -32}, {78, 78, 247}, {79, 122, -32}, },
			{{36, 122, -30}, },
			{{36, 100, -61}, {101, 101, 248}, {102, 122, 57}, },
			{{36, 122, -30}, },
			{{36, 110, -39}, {111, 111, 249}, {112, 122, 57}, },
			{{36, 95, -10}, {97, 101, 57}, {102, 102, 250}, {103, 122, 57}, },
			{{36, 122, -30}, },
		}
	};*/

	private static int[][] accept;
/*  {
		// INITIAL
		{0, 0, 0, 0, 0, 0, 29, -1, 68, 38, 41, -1, 8, 9, 34, 32, 16, 33, 17, 37, 58, 58, 15, 14, 19, -1, 20, 31, 68, 68, 68, 68, 68, 12, 13, 39, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 10, 40, 11, 30, 0, 23, -1, 67, -1, 68, 68, 68, 68, 68, 68, 36, 24, -1, -1, 64, -1, 3, 35, 64, 60, 64, -1, 65, 61, -1, -1, 65, 61, -1, 58, 26, 21, 18, 22, 27, 68, 68, 68, 68, 4, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, 68, 66, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, -1, 65, -1, -1, -1, -1, 3, 3, 3, 64, -1, 65, -1, 65, 63, 63, -1, -1, 64, 59, 59, 59, 28, 53, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 46, 68, 68, 68, 68, 68, -1, -1, 55, 68, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1, -1, 2, 3, -1, -1, 64, 65, 65, 62, 62, 68, 68, 68, 68, 43, 45, 68, 68, 68, 68, 47, 7, 68, 57, 5, -1, 68, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, 68, 68, 68, 68, 68, 6, 48, 68, 44, 68, -1, -1, -1, -1, -1, -1, 50, 68, 51, 68, 49, 68, 56, -1, 68, 42, 68, 52, 68, 68, 54, },

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
				throw new RuntimeException("The file \"lexer.dat\" is either missing or corrupted.");
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
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 13:
						{
							Token token = new13(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 14:
						{
							Token token = new14(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 15:
						{
							Token token = new15(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 16:
						{
							Token token = new16(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 17:
						{
							Token token = new17(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 18:
						{
							Token token = new18(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 19:
						{
							Token token = new19(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 20:
						{
							Token token = new20(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 21:
						{
							Token token = new21(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 22:
						{
							Token token = new22(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 23:
						{
							Token token = new23(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 24:
						{
							Token token = new24(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 25:
						{
							Token token = new25(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 26:
						{
							Token token = new26(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 27:
						{
							Token token = new27(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 28:
						{
							Token token = new28(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 29:
						{
							Token token = new29(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 30:
						{
							Token token = new30(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 31:
						{
							Token token = new31(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 32:
						{
							Token token = new32(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 33:
						{
							Token token = new33(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 34:
						{
							Token token = new34(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 35:
						{
							Token token = new35(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 36:
						{
							Token token = new36(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 37:
						{
							Token token = new37(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 38:
						{
							Token token = new38(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 39:
						{
							Token token = new39(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 40:
						{
							Token token = new40(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 41:
						{
							Token token = new41(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 42:
						{
							Token token = new42(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 43:
						{
							Token token = new43(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 44:
						{
							Token token = new44(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 45:
						{
							Token token = new45(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 46:
						{
							Token token = new46(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 47:
						{
							Token token = new47(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 48:
						{
							Token token = new48(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 49:
						{
							Token token = new49(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 50:
						{
							Token token = new50(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 51:
						{
							Token token = new51(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 52:
						{
							Token token = new52(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 53:
						{
							Token token = new53(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 54:
						{
							Token token = new54(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 55:
						{
							Token token = new55(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 56:
						{
							Token token = new56(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 57:
						{
							Token token = new57(
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 58:
						{
							Token token = new58(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 59:
						{
							Token token = new59(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 60:
						{
							Token token = new60(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 61:
						{
							Token token = new61(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 62:
						{
							Token token = new62(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 63:
						{
							Token token = new63(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 64:
						{
							Token token = new64(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 65:
						{
							Token token = new65(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 66:
						{
							Token token = new66(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 67:
						{
							Token token = new67(
								getText(accept_length),
								start_line + 1,
								start_pos + 1);
							pushBack(accept_length);
							pos = accept_pos;
							line = accept_line;
							return token;
						}
					case 68:
						{
							Token token = new68(
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
	Token new10(int line, int pos) { return new TLBrace(line, pos); }
	Token new11(int line, int pos) { return new TRBrace(line, pos); }
	Token new12(int line, int pos) { return new TLBracket(line, pos); }
	Token new13(int line, int pos) { return new TRBracket(line, pos); }
	Token new14(int line, int pos) { return new TSemicolon(line, pos); }
	Token new15(int line, int pos) { return new TColon(line, pos); }
	Token new16(int line, int pos) { return new TComma(line, pos); }
	Token new17(int line, int pos) { return new TDot(line, pos); }
	Token new18(int line, int pos) { return new TEqual(line, pos); }
	Token new19(int line, int pos) { return new TLess(line, pos); }
	Token new2(String text, int line, int pos) { return new TDocumentationComment(text, line, pos); }
	Token new20(int line, int pos) { return new TGreater(line, pos); }
	Token new21(int line, int pos) { return new TLessEqual(line, pos); }
	Token new22(int line, int pos) { return new TGreaterEqual(line, pos); }
	Token new23(int line, int pos) { return new TNotEqual(line, pos); }
	Token new24(int line, int pos) { return new TAnd(line, pos); }
	Token new25(int line, int pos) { return new TOr(line, pos); }
	Token new26(int line, int pos) { return new TShiftLeft(line, pos); }
	Token new27(int line, int pos) { return new TSignedShiftRight(line, pos); }
	Token new28(int line, int pos) { return new TUnsignedShiftRight(line, pos); }
	Token new29(int line, int pos) { return new TNot(line, pos); }
	Token new3(String text, int line, int pos) { return new TEndOfLineComment(text, line, pos); }
	Token new30(int line, int pos) { return new TBitComplement(line, pos); }
	Token new31(int line, int pos) { return new TQuestion(line, pos); }
	Token new32(int line, int pos) { return new TPlus(line, pos); }
	Token new33(int line, int pos) { return new TMinus(line, pos); }
	Token new34(int line, int pos) { return new TStar(line, pos); }
	Token new35(int line, int pos) { return new TWeakDiv(line, pos); }
	Token new36(int line, int pos) { return new TWeakMod(line, pos); }
	Token new37(int line, int pos) { return new TStrongDiv(line, pos); }
	Token new38(int line, int pos) { return new TStrongMod(line, pos); }
	Token new39(int line, int pos) { return new TBitXor(line, pos); }
	Token new4(int line, int pos) { return new TDim(line, pos); }
	Token new40(int line, int pos) { return new TBitOr(line, pos); }
	Token new41(int line, int pos) { return new TBitAnd(line, pos); }
	Token new42(int line, int pos) { return new TBoolean(line, pos); }
	Token new43(int line, int pos) { return new TByte(line, pos); }
	Token new44(int line, int pos) { return new TShort(line, pos); }
	Token new45(int line, int pos) { return new TChar(line, pos); }
	Token new46(int line, int pos) { return new TInt(line, pos); }
	Token new47(int line, int pos) { return new TLong(line, pos); }
	Token new48(int line, int pos) { return new TFloat(line, pos); }
	Token new49(int line, int pos) { return new TDouble(line, pos); }
	Token new5(int line, int pos) { return new TTrue(line, pos); }
	Token new50(int line, int pos) { return new TInvoke(line, pos); }
	Token new51(int line, int pos) { return new TReturn(line, pos); }
	Token new52(int line, int pos) { return new TLocation(line, pos); }
	Token new53(int line, int pos) { return new TExpression(line, pos); }
	Token new54(int line, int pos) { return new TInstanceof(line, pos); }
	Token new55(int line, int pos) { return new TRetVal(line, pos); }
	Token new56(int line, int pos) { return new TThread(line, pos); }
	Token new57(int line, int pos) { return new TThis(line, pos); }
	Token new58(String text, int line, int pos) { return new TDecIntLiteral(text, line, pos); }
	Token new59(String text, int line, int pos) { return new THexIntLiteral(text, line, pos); }
	Token new6(int line, int pos) { return new TFalse(line, pos); }
	Token new60(String text, int line, int pos) { return new TOctIntLiteral(text, line, pos); }
	Token new61(String text, int line, int pos) { return new TDecLongLiteral(text, line, pos); }
	Token new62(String text, int line, int pos) { return new THexLongLiteral(text, line, pos); }
	Token new63(String text, int line, int pos) { return new TOctLongLiteral(text, line, pos); }
	Token new64(String text, int line, int pos) { return new TDoubleLiteral(text, line, pos); }
	Token new65(String text, int line, int pos) { return new TFloatLiteral(text, line, pos); }
	Token new66(String text, int line, int pos) { return new TCharLiteral(text, line, pos); }
	Token new67(String text, int line, int pos) { return new TStringLiteral(text, line, pos); }
	Token new68(String text, int line, int pos) { return new TId(text, line, pos); }
	Token new7(int line, int pos) { return new TNull(line, pos); }
	Token new8(int line, int pos) { return new TLParen(line, pos); }
	Token new9(int line, int pos) { return new TRParen(line, pos); }
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
