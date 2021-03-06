/**
 * This software is released under the University of Illinois/Research and Academic Use License. See
 * the LICENSE file in the root folder for details. Copyright (c) 2016
 *
 * Developed by: The Cognitive Computation Group University of Illinois at Urbana-Champaign
 * http://cogcomp.org/
 */
package edu.illinois.cs.cogcomp.ner.LbjTagger;

import edu.illinois.cs.cogcomp.lbjava.parse.LinkedVector;

import java.util.ArrayList;

public class NERDocument {
    public String docname;

    public NERDocument(ArrayList<LinkedVector> vector, String documentName) {
        docname = documentName;
        sentences = vector;
    }

    public ArrayList<LinkedVector> sentences;
}
