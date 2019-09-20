/*
 * Copyright 2019 leondss@qq.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.leonds.core.resp;

/**
 * @author Leon
 */
public final class ResponseBuilderImpl extends Response.ResponseBuilder {

    private int status;
    private Object data;
    private String message;

    public ResponseBuilderImpl() {
    }


    public ResponseBuilderImpl(ResponseBuilderImpl that) {
        this.status = that.status;
        this.data = that.data;
        this.message = that.message;
    }

    @Override
    public Response build() {
        return new ResponseImpl(this.status, this.data, this.message);
    }

    @Override
    public Response.ResponseBuilder clone() {
        return new ResponseBuilderImpl(this);
    }

    @Override
    public Response.ResponseBuilder status(int status) {
        this.status = status;
        return this;
    }

    @Override
    public Response.ResponseBuilder data(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public Response.ResponseBuilder message(String message) {
        this.message = message;
        return this;
    }
}
