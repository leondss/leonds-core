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

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * 分页对象
 *
 * @author Leon
 */
public class QueryPageImpl<T> implements Page<T>, Serializable {

    private static final long serialVersionUID = -1343296556002553510L;
    private final List<T> rows;

    /**
     * 当前页
     */
    private final int page;

    /**
     * 每页显示条数
     */
    private final int size;

    /**
     * 总条数
     */
    private final long total;

    public QueryPageImpl(int page, int size, long total, List<T> rows) {
        this.page = page;
        this.size = size;
        this.total = total;
        this.rows = rows;
    }

    public QueryPageImpl(int page, int size) {
        this(page, size, 0, null);
    }

    public List<T> getRows() {
        return rows == null ? Collections.emptyList() : rows;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public long getTotal() {
        return this.total;
    }

    public int getTotalPages() {
        return (int) (total / (long) getSize()) + (total % (long) getSize() > 0L ? 1 : 0);
    }

    public int getPrePage() {
        return page - 1 < 0 ? 0 : page - 1;
    }

    public int getNextPage() {
        return page + 1 > getTotalPages() ? getTotalPages() : page + 1;
    }
}
