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

import java.util.List;

/**
 * 分页
 *
 * @author Leon
 */
public interface Page<T> {
    /**
     * 获取记录集合
     *
     * @return 集合
     */
    List<T> getRows();

    /**
     * 获取当前第几页
     *
     * @return 页码
     */
    int getPage();

    /**
     * 获取分页条数
     *
     * @return 条数
     */
    int getSize();

    /**
     * 获取总记录条数
     *
     * @return 总记录条数
     */
    long getTotal();

    /**
     * 获取总页数
     *
     * @return 总页数
     */
    int getTotalPages();
}
