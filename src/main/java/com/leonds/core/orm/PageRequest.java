/*
 * Copyright 2019 leonds@qq.com
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

package com.leonds.core.orm;

/**
 * @author Leon
 */
public class PageRequest {
    private final int page;
    private final int size;
    private final String orderBy;

    public static PageRequest of(int page, int size) {
        return new PageRequest(page, size);
    }

    public static PageRequest of(int page, int size, String orderBy) {
        return new PageRequest(page, size, orderBy);
    }

    private PageRequest(int page, int size) {
        this(page, size, null);
    }

    private PageRequest(int page, int size, String orderBy) {
        this.page = page;
        this.size = size == 0 ? 15 : size;
        this.orderBy = orderBy;
    }

    public int getOffset() {
        return page * size;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public String getOrderBy() {
        return orderBy;
    }
}
