/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */

package org.apache.spark.datasource.reader

import org.apache.spark.sql.connector.read.{Scan, ScanBuilder}

class TextReaderBuilder extends ScanBuilder{
  override def build(): Scan = {
    throw new UnsupportedOperationException("Not support")
  }
}
