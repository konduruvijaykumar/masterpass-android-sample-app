/*
 *    ****************************************************************************
 *    Copyright (c) 2015, MasterCard International Incorporated and/or its
 *    affiliates. All rights reserved.
 *    <p/>
 *    The contents of this file may only be used subject to the MasterCard
 *    Mobile Payment SDK for MCBP and/or MasterCard Mobile MPP UI SDK
 *    Materials License.
 *    <p/>
 *    Please refer to the file LICENSE.TXT for full details.
 *    <p/>
 *    TO THE EXTENT PERMITTED BY LAW, THE SOFTWARE IS PROVIDED "AS IS", WITHOUT
 *    WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *    WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *    NON INFRINGEMENT. TO THE EXTENT PERMITTED BY LAW, IN NO EVENT SHALL
 *    MASTERCARD OR ITS AFFILIATES BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 *    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 *    IN THE SOFTWARE.
 *    *****************************************************************************
 */

package com.mastercard.mymerchant.model;

/**
 * Model for products
 */
public class Product {
    /**
     * The name of the product.
     */
    public final String mName;
    /**
     * The description of the product.
     */
    public final String mDescription;
    /**
     * The product rating.
     */
    public final float mRating;
    /**
     * The product price.
     */
    public final long mPrice;
    /**
     * The product image.
     */
    public final int mImageResource;
    /**
     * If the product is digital only.
     **/
    public final boolean mIsDigital;

    public Product(String name, String description, float rating, long price, int imageResource, boolean isDigital) {
        mName = name;
        mDescription = description;
        mRating = rating;
        mPrice = price;
        mImageResource = imageResource;
        mIsDigital = isDigital;
    }
}
