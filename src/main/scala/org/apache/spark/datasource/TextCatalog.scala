/*
 * Copyright (C) 2021 Baidu, Inc. All Rights Reserved.
 */

package org.apache.spark.datasource

import org.apache.spark.sql.connector.catalog.{Identifier, Table, TableCatalog, TableChange}
import org.apache.spark.sql.connector.expressions.Transform
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.util.CaseInsensitiveStringMap

import java.util

class TextCatalog extends TableCatalog {
  override def listTables(namespace: Array[String]): Array[Identifier] = ???

  override def loadTable(ident: Identifier): Table = ???

  override def createTable(ident: Identifier, schema: StructType, partitions: Array[Transform], properties: util.Map[String, String]): Table = ???

  override def alterTable(ident: Identifier, changes: TableChange*): Table = ???

  override def dropTable(ident: Identifier): Boolean = ???

  override def renameTable(oldIdent: Identifier, newIdent: Identifier): Unit = ???

  override def initialize(name: String, options: CaseInsensitiveStringMap): Unit = ???

  override def name(): String = ???
}
