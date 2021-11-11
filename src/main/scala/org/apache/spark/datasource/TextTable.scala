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

  override def name(): String = ???

  override def schema(): StructType = ???

  override def capabilities(): util.Set[TableCapability] = ???

  override def newScanBuilder(options: CaseInsensitiveStringMap): ScanBuilder = ???

  override def newWriteBuilder(info: LogicalWriteInfo): WriteBuilder = ???

  override def toString: String = s"Text Table $name"
}
