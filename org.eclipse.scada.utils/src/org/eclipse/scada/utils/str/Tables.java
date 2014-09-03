/*******************************************************************************
 * Copyright (c) 2013 Jens Reimann and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.utils.str;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/**
 * @since 0.1.0
 */
public final class Tables
{
    private Tables ()
    {
    }

    private static interface Output
    {
        public void println ();

        public void println ( String string );

        public void println ( char c );
    }

    /**
     * Print out a table
     *
     * @param out
     *            the stream to print to
     * @param header
     *            the column headers
     * @param data
     *            the data, in rows and cells
     * @param gap
     *            gap between columns
     */
    public static void showTable ( final PrintStream out, final List<String> header, final List<List<String>> data, final int gap ) throws IOException
    {
        showTable ( new Output () {

            @Override
            public void println ()
            {
                out.println ();
            }

            @Override
            public void println ( final String string )
            {
                out.println ( string );
            }

            @Override
            public void println ( final char c )
            {
                out.println ( c );
            }
        }, header, data, gap );
    }

    /**
     * Print out a table
     *
     * @since 0.2.0
     * @param out
     *            the stream to print to
     * @param header
     *            the column headers
     * @param data
     *            the data, in rows and cells
     * @param gap
     *            gap between columns
     */
    public static void showTable ( final PrintWriter out, final List<String> header, final List<List<String>> data, final int gap ) throws IOException
    {
        showTable ( new Output () {

            @Override
            public void println ()
            {
                out.println ();
            }

            @Override
            public void println ( final String string )
            {
                out.println ( string );
            }

            @Override
            public void println ( final char c )
            {
                out.println ( c );
            }
        }, header, data, gap );
    }

    protected static void showTable ( final Output out, final List<String> header, final List<List<String>> data, int gap ) throws IOException
    {
        if ( gap < 0 )
        {
            gap = 0;
        }

        int max = header.size ();
        for ( final List<String> row : data )
        {
            max = Math.max ( row.size (), max );
        }

        final int[] lens = new int[max];

        {
            int i = 0;
            for ( final String cell : header )
            {
                if ( cell != null )
                {
                    lens[i] = Math.max ( lens[i], cell.length () );
                }
                i++;
            }
        }

        for ( final List<String> row : data )
        {
            int i = 0;
            for ( final String cell : row )
            {
                if ( cell != null )
                {
                    lens[i] = Math.max ( lens[i], cell.length () );
                }
                i++;
            }
        }

        final String[] formats = new String[max];

        int totalLen = 0;
        for ( int i = 0; i < formats.length; i++ )
        {
            totalLen += lens[i] + gap;
            formats[i] = String.format ( "%%-%ds", lens[i] + gap );
        }

        {
            int i = 0;
            for ( final String cell : header )
            {
                out.println ( String.format ( formats[i], cell ) );
                i++;
            }
            out.println ();
        }

        // header line
        for ( int i = 0; i < totalLen; i++ )
        {
            out.println ( '=' );
        }
        out.println ();

        // data
        for ( final List<String> row : data )
        {
            int i = 0;
            for ( final String cell : row )
            {
                out.println ( String.format ( formats[i], cell == null ? "" : cell ) );
                i++;
            }
            out.println ();
        }
    }
}
