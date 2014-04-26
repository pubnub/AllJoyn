/******************************************************************************
 * Copyright (c) 2010 - 2011, AllSeen Alliance. All rights reserved.
 *
 *    Permission to use, copy, modify, and/or distribute this software for any
 *    purpose with or without fee is hereby granted, provided that the above
 *    copyright notice and this permission notice appear in all copies.
 *
 *    THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 *    WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 *    MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 *    ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 *    WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 *    ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 *    OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 *
 ******************************************************************************/
/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_alljoyn_bus_samples_simpleclient_Client */

#ifndef _Included_org_alljoyn_bus_samples_simpleclient_Client
#define _Included_org_alljoyn_bus_samples_simpleclient_Client
#ifdef __cplusplus
extern "C" {
#endif
#undef org_alljoyn_bus_samples_simpleclient_Client_BUSNAMEITEM_ADD
#define org_alljoyn_bus_samples_simpleclient_Client_BUSNAMEITEM_ADD 1L
#undef org_alljoyn_bus_samples_simpleclient_Client_BUSNAMEITEM_REMOVE
#define org_alljoyn_bus_samples_simpleclient_Client_BUSNAMEITEM_REMOVE 2L
#undef org_alljoyn_bus_samples_simpleclient_Client_BUSNAMEITEM_DISCONNECT
#define org_alljoyn_bus_samples_simpleclient_Client_BUSNAMEITEM_DISCONNECT 3L
/*
 * Class:     org_alljoyn_bus_samples_simpleclient_Client
 * Method:    simpleOnCreate
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_org_alljoyn_bus_samples_simpleclient_Client_simpleOnCreate
    (JNIEnv *, jobject, jstring);

/*
 * Class:     org_alljoyn_bus_samples_simpleclient_Client
 * Method:    simpleOnDestroy
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_org_alljoyn_bus_samples_simpleclient_Client_simpleOnDestroy
    (JNIEnv *, jobject);

/*
 * Class:     org_alljoyn_bus_samples_simpleclient_Client
 * Method:    simplePing
 * Signature: (ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_alljoyn_bus_samples_simpleclient_Client_simplePing
    (JNIEnv *, jobject, jint, jstring, jstring);

/*
 * Class:     org_alljoyn_bus_samples_simpleclient_Client
 * Method:    joinSession
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_org_alljoyn_bus_samples_simpleclient_Client_joinSession
    (JNIEnv *, jobject, jstring);

/*
 * Class:     org_alljoyn_bus_samples_simpleclient_Client
 * Method:    leaveSession
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_org_alljoyn_bus_samples_simpleclient_Client_leaveSession
    (JNIEnv *, jobject, jint);

#ifdef __cplusplus
}
#endif
#endif
