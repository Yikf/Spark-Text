/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */

package org.apache.spark.datasource

import org.apache.spark.sql.connector.catalog.{SupportsRead, SupportsWrite, Table, TableCapability}
import org.apache.spark.sql.connector.read.ScanBuilder
import org.apache.spark.sql.connector.write.{LogicalWriteInfo, WriteBuilder}
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.util.CaseInsensitiveStringMap

import java.util

class TextTable extends Table with SupportsRead with SupportsWrite {

  override def name(): String = "textv2"

  override def schema(): StructType = {
    throw new UnsupportedOperationException("Not support")
  }

  override def capabilities(): util.Set[TableCapability] = {
    throw new UnsupportedOperationException("Not support")
  }

  override def newScanBuilder(options: CaseInsensitiveStringMap): ScanBuilder = {
    throw new UnsupportedOperationException("Not support")
  }

  override def newWriteBuilder(info: LogicalWriteInfo): WriteBuilder = {
    throw new UnsupportedOperationException("Not support")
  }

  override def toString: String = s"Text Table $name"
}
