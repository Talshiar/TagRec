/**
 * Copyright (c) 2006-2009, NEPOMUK Consortium
 * 
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *     * Redistributions of source code must retain the above copyright notice, 
 *       this list of conditions and the following disclaimer.
 *
 *     * Redistributions in binary form must reproduce the above copyright 
 *       notice, this list of conditions and the following disclaimer in the 
 * 	documentation and/or other materials provided with the distribution.
 *
 *     * Neither the name of the NEPOMUK Consortium nor the names of its 
 *       contributors may be used to endorse or promote products derived from 
 * 	this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 **/
package processing.folkrank;

import java.util.LinkedList;

/** This class stores the result of the FolkRank computation, that is basically
 * a weight vector for each dimension.
 * 
 * @author rja
 */
public class StandardFolkRankResult implements FolkRankResult {

    private double[][] weights;
    private LinkedList<Double> errors = new LinkedList<Double>();
    
    /**
     * @see org.semanticdesktop.nepomuk.comp.folkpeer.folkrank.data.FolkRankResult#getWeights()
     */
    @Override
	public double[][] getWeights() {
        return weights;
    }
    /**
     * @see org.semanticdesktop.nepomuk.comp.folkpeer.folkrank.data.FolkRankResult#setWeights(double[][])
     */
    @Override
	public void setWeights(double[][] weights) {
        this.weights = weights;
    }

    /**
     * @see org.semanticdesktop.nepomuk.comp.folkpeer.folkrank.data.FolkRankResult#getErrors()
     */
    @Override
	public LinkedList<Double> getErrors() {
        return errors;
    }
    /**
     * @see org.semanticdesktop.nepomuk.comp.folkpeer.folkrank.data.FolkRankResult#addError(double)
     */
    @Override
	public void addError(double error) {
        this.errors.add(error);
    }
    
    /*
     * not supported by this implementation
     */
    @Override
	public double[][] getAPRWeights() {
        return null;
    }
    @Override
	public void setAPRWeights(double[][] weights) {
    }
    
}
