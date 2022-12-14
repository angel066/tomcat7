/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$7 {

    static final FunctionDescriptor X509_STORE_add_lookup$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle X509_STORE_add_lookup$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "X509_STORE_add_lookup",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$7.X509_STORE_add_lookup$FUNC, false
    );
    static final FunctionDescriptor X509_LOOKUP_hash_dir$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle X509_LOOKUP_hash_dir$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "X509_LOOKUP_hash_dir",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$7.X509_LOOKUP_hash_dir$FUNC, false
    );
    static final FunctionDescriptor X509_LOOKUP_file$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle X509_LOOKUP_file$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "X509_LOOKUP_file",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$7.X509_LOOKUP_file$FUNC, false
    );
    static final FunctionDescriptor X509_LOOKUP_ctrl$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle X509_LOOKUP_ctrl$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "X509_LOOKUP_ctrl",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$7.X509_LOOKUP_ctrl$FUNC, false
    );
    static final FunctionDescriptor X509_STORE_CTX_get_ex_data$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle X509_STORE_CTX_get_ex_data$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "X509_STORE_CTX_get_ex_data",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$7.X509_STORE_CTX_get_ex_data$FUNC, false
    );
    static final FunctionDescriptor X509_STORE_CTX_get_error$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle X509_STORE_CTX_get_error$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "X509_STORE_CTX_get_error",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$7.X509_STORE_CTX_get_error$FUNC, false
    );
}


