/*
 *  Copyright (c) 2012 Malhar, Inc.
 *  All Rights Reserved.
 */
package com.malhartech.engine;

import com.malhartech.api.Sink;
import com.malhartech.engine.OperatorStats.Counter;

/**
 *
 * @author Chetan Narsude <chetan@malhar-inc.com>
 */
public interface CounterSink<T> extends Sink<T>, Counter
{
  public static final CounterSink<?>[] NO_SINKS = new CounterSink[0];
}