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

package com.mastercard.mymerchant.network.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Model representing DSRP Data in checkout resources response
 */
public class DSRP {
    @SerializedName("DSRPOptions")
    private DSRPOptions dsrpOptions;
    @SerializedName("UnpredictableNumber")
    private String unpredictableNumber;

    public DSRP() {
    }

    public DSRP(DSRPOptions dsrpOptions, String unpredictableNumber) {
        this.dsrpOptions = dsrpOptions;
        this.unpredictableNumber = unpredictableNumber;
    }

    public DSRPOptions getDsrpOptions() {
        return dsrpOptions;
    }

    public void setDsrpOptions(DSRPOptions dsrpOptions) {
        this.dsrpOptions = dsrpOptions;
    }

    public String getUnpredictableNumber() {
        return unpredictableNumber;
    }

    public void setUnpredictableNumber(String unpredictableNumber) {
        this.unpredictableNumber = unpredictableNumber;
    }
}
