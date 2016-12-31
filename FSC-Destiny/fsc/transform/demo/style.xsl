<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/csvfile">

<FSC-Destiny-PatronImport version="2">
<xsl:for-each select="line">
  <Patron action="addmodify">
    <Match>
      <DistrictID><xsl:value-of select="field_1"/></DistrictID>
    </Match>

    <Barcode><xsl:value-of select= "field_0"/></Barcode> 
    <LastName><xsl:value-of select= "field_2"/></LastName>
    <FirstName><xsl:value-of select= "field_3"/></FirstName>
  </Patron>
</xsl:for-each>
</FSC-Destiny-PatronImport>

</xsl:template>
</xsl:stylesheet>

