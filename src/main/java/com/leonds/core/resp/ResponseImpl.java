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

import java.io.Serializable;

/**
 * @author Leon
 */
public class ResponseImpl extends Response implements Serializable {

    private static final long serialVersionUID = -5558577507694126573L;
    private final int status;
    private final Object data;
    private final String message;

    public ResponseImpl(int status, Object data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    @Override
    public int getStatus() {
        return this.status;
    }

    @Override
    public Object getData() {
        return this.data;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
