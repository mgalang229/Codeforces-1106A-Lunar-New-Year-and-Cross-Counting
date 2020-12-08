import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
//		int t=in.nextInt();
		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt();
			String s[] = new String[n];
			for(int i=0; i<n; ++i)
				s[i]=in.next();
			char[][] a = new char[s.length][];
			for(int i=0; i<(int)s.length; ++i)
				a[i]=s[i].toCharArray();
			int cnt=0;
			for(int i=0; i<(int)s.length; ++i)
				for(int j=0; j<(int)s[i].length(); ++j)
					if(i-1>=0&&i+1<(int)s.length&&j-1>=0&&j+1<(int)s[i].length())
						if(a[i][j]=='X'&&a[i-1][j-1]=='X'&&a[i-1][j+1]=='X'&&a[i+1][j-1]=='X'&&a[i+1][j+1]=='X')
							cnt++;
			out.println(cnt);
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}
