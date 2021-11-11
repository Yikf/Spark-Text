/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */

package org.apache.spark.datasource.reader

import org.apache.spark.sql.connector.read.{Scan, ScanBuilder}

class TextBuilder extends ScanBuilder{
  override def build(): Scan = ???
}
