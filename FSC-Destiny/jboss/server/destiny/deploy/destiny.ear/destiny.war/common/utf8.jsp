<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<HTML>
<HEAD>
<TITLE>
index
</TITLE>
</HEAD>
<BODY>
<H1>
UTF-8 Test Page
</H1>

<p>All the data on the page was sent to your browser in the UTF-8 encoding.</p>

<p>Your browser identifies itself as: <b><%= request.getHeader( "User-Agent" ) %></b>. </p>

<p>Test of UTF-8 encoding of the Unicode characters 160-255 (the ISO-8859-1 set, AKA Latin-1)</p>
<table border="1" cellspacing="0" cellpadding="3">
<tr><td>u00a0</td><td><%= "\u00a0" %></td><td>NO-BREAK SPACE</td></tr>
<tr><td>u00a1</td><td><%= "\u00a1" %></td><td>INVERTED EXCLAMATION MARK</td></tr>
<tr><td>u00a2</td><td><%= "\u00a2" %></td><td>CENT SIGN</td></tr>
<tr><td>u00a3</td><td><%= "\u00a3" %></td><td>POUND SIGN</td></tr>
<tr><td>u00a4</td><td><%= "\u00a4" %></td><td>CURRENCY SIGN</td></tr>
<tr><td>u00a5</td><td><%= "\u00a5" %></td><td>YEN SIGN</td></tr>
<tr><td>u00a6</td><td><%= "\u00a6" %></td><td>BROKEN BAR</td></tr>
<tr><td>u00a7</td><td><%= "\u00a7" %></td><td>SECTION SIGN</td></tr>
<tr><td>u00a8</td><td><%= "\u00a8" %></td><td>DIAERESIS</td></tr>
<tr><td>u00a9</td><td><%= "\u00a9" %></td><td>COPYRIGHT SIGN</td></tr>
<tr><td>u00aa</td><td><%= "\u00aa" %></td><td>FEMININE ORDINAL INDICATOR</td></tr>
<tr><td>u00ab</td><td><%= "\u00ab" %></td><td>LEFT-POINTING DOUBLE ANGLE QUOTATION MARK</td></tr>
<tr><td>u00ac</td><td><%= "\u00ac" %></td><td>NOT SIGN</td></tr>
<tr><td>u00ad</td><td><%= "\u00ad" %></td><td>SOFT HYPHEN</td></tr>
<tr><td>u00ae</td><td><%= "\u00ae" %></td><td>REGISTERED SIGN</td></tr>
<tr><td>u00af</td><td><%= "\u00af" %></td><td>MACRON</td></tr>
<tr><td>u00b0</td><td><%= "\u00b0" %></td><td>DEGREE SIGN</td></tr>
<tr><td>u00b1</td><td><%= "\u00b1" %></td><td>PLUS-MINUS SIGN</td></tr>
<tr><td>u00b2</td><td><%= "\u00b2" %></td><td>SUPERSCRIPT TWO</td></tr>
<tr><td>u00b3</td><td><%= "\u00b3" %></td><td>SUPERSCRIPT THREE</td></tr>
<tr><td>u00b4</td><td><%= "\u00b4" %></td><td>ACUTE ACCENT</td></tr>
<tr><td>u00b5</td><td><%= "\u00b5" %></td><td>MICRO SIGN</td></tr>
<tr><td>u00b6</td><td><%= "\u00b6" %></td><td>PILCROW SIGN</td></tr>
<tr><td>u00b7</td><td><%= "\u00b7" %></td><td>MIDDLE DOT</td></tr>
<tr><td>u00b8</td><td><%= "\u00b8" %></td><td>CEDILLA</td></tr>
<tr><td>u00b9</td><td><%= "\u00b9" %></td><td>SUPERSCRIPT ONE</td></tr>
<tr><td>u00ba</td><td><%= "\u00ba" %></td><td>MASCULINE ORDINAL INDICATOR</td></tr>
<tr><td>u00bb</td><td><%= "\u00bb" %></td><td>RIGHT-POINTING DOUBLE ANGLE QUOTATION MARK</td></tr>
<tr><td>u00bc</td><td><%= "\u00bc" %></td><td>VULGAR FRACTION ONE QUARTER</td></tr>
<tr><td>u00bd</td><td><%= "\u00bd" %></td><td>VULGAR FRACTION ONE HALF</td></tr>
<tr><td>u00be</td><td><%= "\u00be" %></td><td>VULGAR FRACTION THREE QUARTERS</td></tr>
<tr><td>u00bf</td><td><%= "\u00bf" %></td><td>INVERTED QUESTION MARK</td></tr>
<tr><td>u00c0</td><td><%= "\u00c0" %></td><td>LATIN CAPITAL LETTER A WITH GRAVE</td></tr>
<tr><td>u00c1</td><td><%= "\u00c1" %></td><td>LATIN CAPITAL LETTER A WITH ACUTE</td></tr>
<tr><td>u00c2</td><td><%= "\u00c2" %></td><td>LATIN CAPITAL LETTER A WITH CIRCUMFLEX</td></tr>
<tr><td>u00c3</td><td><%= "\u00c3" %></td><td>LATIN CAPITAL LETTER A WITH TILDE</td></tr>
<tr><td>u00c4</td><td><%= "\u00c4" %></td><td>LATIN CAPITAL LETTER A WITH DIAERESIS</td></tr>
<tr><td>u00c5</td><td><%= "\u00c5" %></td><td>LATIN CAPITAL LETTER A WITH RING ABOVE</td></tr>
<tr><td>u00c6</td><td><%= "\u00c6" %></td><td>LATIN CAPITAL LETTER AE</td></tr>
<tr><td>u00c7</td><td><%= "\u00c7" %></td><td>LATIN CAPITAL LETTER C WITH CEDILLA</td></tr>
<tr><td>u00c8</td><td><%= "\u00c8" %></td><td>LATIN CAPITAL LETTER E WITH GRAVE</td></tr>
<tr><td>u00c9</td><td><%= "\u00c9" %></td><td>LATIN CAPITAL LETTER E WITH ACUTE</td></tr>
<tr><td>u00ca</td><td><%= "\u00ca" %></td><td>LATIN CAPITAL LETTER E WITH CIRCUMFLEX</td></tr>
<tr><td>u00cb</td><td><%= "\u00cb" %></td><td>LATIN CAPITAL LETTER E WITH DIAERESIS</td></tr>
<tr><td>u00cc</td><td><%= "\u00cc" %></td><td>LATIN CAPITAL LETTER I WITH GRAVE</td></tr>
<tr><td>u00cd</td><td><%= "\u00cd" %></td><td>LATIN CAPITAL LETTER I WITH ACUTE</td></tr>
<tr><td>u00ce</td><td><%= "\u00ce" %></td><td>LATIN CAPITAL LETTER I WITH CIRCUMFLEX</td></tr>
<tr><td>u00cf</td><td><%= "\u00cf" %></td><td>LATIN CAPITAL LETTER I WITH DIAERESIS</td></tr>
<tr><td>u00d0</td><td><%= "\u00d0" %></td><td>LATIN CAPITAL LETTER ETH</td></tr>
<tr><td>u00d1</td><td><%= "\u00d1" %></td><td>LATIN CAPITAL LETTER N WITH TILDE</td></tr>
<tr><td>u00d2</td><td><%= "\u00d2" %></td><td>LATIN CAPITAL LETTER O WITH GRAVE</td></tr>
<tr><td>u00d3</td><td><%= "\u00d3" %></td><td>LATIN CAPITAL LETTER O WITH ACUTE</td></tr>
<tr><td>u00d4</td><td><%= "\u00d4" %></td><td>LATIN CAPITAL LETTER O WITH CIRCUMFLEX</td></tr>
<tr><td>u00d5</td><td><%= "\u00d5" %></td><td>LATIN CAPITAL LETTER O WITH TILDE</td></tr>
<tr><td>u00d6</td><td><%= "\u00d6" %></td><td>LATIN CAPITAL LETTER O WITH DIAERESIS</td></tr>
<tr><td>u00d7</td><td><%= "\u00d7" %></td><td>MULTIPLICATION SIGN</td></tr>
<tr><td>u00d8</td><td><%= "\u00d8" %></td><td>LATIN CAPITAL LETTER O WITH STROKE</td></tr>
<tr><td>u00d9</td><td><%= "\u00d9" %></td><td>LATIN CAPITAL LETTER U WITH GRAVE</td></tr>
<tr><td>u00da</td><td><%= "\u00da" %></td><td>LATIN CAPITAL LETTER U WITH ACUTE</td></tr>
<tr><td>u00db</td><td><%= "\u00db" %></td><td>LATIN CAPITAL LETTER U WITH CIRCUMFLEX</td></tr>
<tr><td>u00dc</td><td><%= "\u00dc" %></td><td>LATIN CAPITAL LETTER U WITH DIAERESIS</td></tr>
<tr><td>u00dd</td><td><%= "\u00dd" %></td><td>LATIN CAPITAL LETTER Y WITH ACUTE</td></tr>
<tr><td>u00de</td><td><%= "\u00de" %></td><td>LATIN CAPITAL LETTER THORN</td></tr>
<tr><td>u00df</td><td><%= "\u00df" %></td><td>LATIN SMALL LETTER SHARP S</td></tr>
<tr><td>u00e0</td><td><%= "\u00e0" %></td><td>LATIN SMALL LETTER A WITH GRAVE</td></tr>
<tr><td>u00e1</td><td><%= "\u00e1" %></td><td>LATIN SMALL LETTER A WITH ACUTE</td></tr>
<tr><td>u00e2</td><td><%= "\u00e2" %></td><td>LATIN SMALL LETTER A WITH CIRCUMFLEX</td></tr>
<tr><td>u00e3</td><td><%= "\u00e3" %></td><td>LATIN SMALL LETTER A WITH TILDE</td></tr>
<tr><td>u00e4</td><td><%= "\u00e4" %></td><td>LATIN SMALL LETTER A WITH DIAERESIS</td></tr>
<tr><td>u00e5</td><td><%= "\u00e5" %></td><td>LATIN SMALL LETTER A WITH RING ABOVE</td></tr>
<tr><td>u00e6</td><td><%= "\u00e6" %></td><td>LATIN SMALL LETTER AE</td></tr>
<tr><td>u00e7</td><td><%= "\u00e7" %></td><td>LATIN SMALL LETTER C WITH CEDILLA</td></tr>
<tr><td>u00e8</td><td><%= "\u00e8" %></td><td>LATIN SMALL LETTER E WITH GRAVE</td></tr>
<tr><td>u00e9</td><td><%= "\u00e9" %></td><td>LATIN SMALL LETTER E WITH ACUTE</td></tr>
<tr><td>u00ea</td><td><%= "\u00ea" %></td><td>LATIN SMALL LETTER E WITH CIRCUMFLEX</td></tr>
<tr><td>u00eb</td><td><%= "\u00eb" %></td><td>LATIN SMALL LETTER E WITH DIAERESIS</td></tr>
<tr><td>u00ec</td><td><%= "\u00ec" %></td><td>LATIN SMALL LETTER I WITH GRAVE</td></tr>
<tr><td>u00ed</td><td><%= "\u00ed" %></td><td>LATIN SMALL LETTER I WITH ACUTE</td></tr>
<tr><td>u00ee</td><td><%= "\u00ee" %></td><td>LATIN SMALL LETTER I WITH CIRCUMFLEX</td></tr>
<tr><td>u00ef</td><td><%= "\u00ef" %></td><td>LATIN SMALL LETTER I WITH DIAERESIS</td></tr>
<tr><td>u00f0</td><td><%= "\u00f0" %></td><td>LATIN SMALL LETTER ETH</td></tr>
<tr><td>u00f1</td><td><%= "\u00f1" %></td><td>LATIN SMALL LETTER N WITH TILDE</td></tr>
<tr><td>u00f2</td><td><%= "\u00f2" %></td><td>LATIN SMALL LETTER O WITH GRAVE</td></tr>
<tr><td>u00f3</td><td><%= "\u00f3" %></td><td>LATIN SMALL LETTER O WITH ACUTE</td></tr>
<tr><td>u00f4</td><td><%= "\u00f4" %></td><td>LATIN SMALL LETTER O WITH CIRCUMFLEX</td></tr>
<tr><td>u00f5</td><td><%= "\u00f5" %></td><td>LATIN SMALL LETTER O WITH TILDE</td></tr>
<tr><td>u00f6</td><td><%= "\u00f6" %></td><td>LATIN SMALL LETTER O WITH DIAERESIS</td></tr>
<tr><td>u00f7</td><td><%= "\u00f7" %></td><td>DIVISION SIGN</td></tr>
<tr><td>u00f8</td><td><%= "\u00f8" %></td><td>LATIN SMALL LETTER O WITH STROKE</td></tr>
<tr><td>u00f9</td><td><%= "\u00f9" %></td><td>LATIN SMALL LETTER U WITH GRAVE</td></tr>
<tr><td>u00fa</td><td><%= "\u00fa" %></td><td>LATIN SMALL LETTER U WITH ACUTE</td></tr>
<tr><td>u00fb</td><td><%= "\u00fb" %></td><td>LATIN SMALL LETTER U WITH CIRCUMFLEX</td></tr>
<tr><td>u00fc</td><td><%= "\u00fc" %></td><td>LATIN SMALL LETTER U WITH DIAERESIS</td></tr>
<tr><td>u00fd</td><td><%= "\u00fd" %></td><td>LATIN SMALL LETTER Y WITH ACUTE</td></tr>
<tr><td>u00fe</td><td><%= "\u00fe" %></td><td>LATIN SMALL LETTER THORN</td></tr>
<tr><td>u00ff</td><td><%= "\u00ff" %></td><td>LATIN SMALL LETTER Y WITH DIAERESIS</td></tr>
</table>

<p>Test of UTF-8 encoding of the Unicode characters 256-383 (the Latin Extended-A set)</p>
<table border="1" cellspacing="0" cellpadding="3">
<tr><td>u0100</td><td><%= "\u0100" %></td><td>LATIN CAPITAL LETTER A WITH MACRON</td></tr>
<tr><td>u0101</td><td><%= "\u0101" %></td><td>LATIN SMALL LETTER A WITH MACRON</td></tr>
<tr><td>u0102</td><td><%= "\u0102" %></td><td>LATIN CAPITAL LETTER A WITH BREVE</td></tr>
<tr><td>u0103</td><td><%= "\u0103" %></td><td>LATIN SMALL LETTER A WITH BREVE</td></tr>
<tr><td>u0104</td><td><%= "\u0104" %></td><td>LATIN CAPITAL LETTER A WITH OGONEK</td></tr>
<tr><td>u0105</td><td><%= "\u0105" %></td><td>LATIN SMALL LETTER A WITH OGONEK</td></tr>
<tr><td>u0106</td><td><%= "\u0106" %></td><td>LATIN CAPITAL LETTER C WITH ACUTE</td></tr>
<tr><td>u0107</td><td><%= "\u0107" %></td><td>LATIN SMALL LETTER C WITH ACUTE</td></tr>
<tr><td>u0108</td><td><%= "\u0108" %></td><td>LATIN CAPITAL LETTER C WITH CIRCUMFLEX</td></tr>
<tr><td>u0109</td><td><%= "\u0109" %></td><td>LATIN SMALL LETTER C WITH CIRCUMFLEX</td></tr>
<tr><td>u010a</td><td><%= "\u010a" %></td><td>LATIN CAPITAL LETTER C WITH DOT ABOVE</td></tr>
<tr><td>u010b</td><td><%= "\u010b" %></td><td>LATIN SMALL LETTER C WITH DOT ABOVE</td></tr>
<tr><td>u010c</td><td><%= "\u010c" %></td><td>LATIN CAPITAL LETTER C WITH CARON</td></tr>
<tr><td>u010d</td><td><%= "\u010d" %></td><td>LATIN SMALL LETTER C WITH CARON</td></tr>
<tr><td>u010e</td><td><%= "\u010e" %></td><td>LATIN CAPITAL LETTER D WITH CARON</td></tr>
<tr><td>u010f</td><td><%= "\u010f" %></td><td>LATIN SMALL LETTER D WITH CARON</td></tr>
<tr><td>u0110</td><td><%= "\u0110" %></td><td>LATIN CAPITAL LETTER D WITH STROKE</td></tr>
<tr><td>u0111</td><td><%= "\u0111" %></td><td>LATIN SMALL LETTER D WITH STROKE</td></tr>
<tr><td>u0112</td><td><%= "\u0112" %></td><td>LATIN CAPITAL LETTER E WITH MACRON</td></tr>
<tr><td>u0113</td><td><%= "\u0113" %></td><td>LATIN SMALL LETTER E WITH MACRON</td></tr>
<tr><td>u0114</td><td><%= "\u0114" %></td><td>LATIN CAPITAL LETTER E WITH BREVE</td></tr>
<tr><td>u0115</td><td><%= "\u0115" %></td><td>LATIN SMALL LETTER E WITH BREVE</td></tr>
<tr><td>u0116</td><td><%= "\u0116" %></td><td>LATIN CAPITAL LETTER E WITH DOT ABOVE</td></tr>
<tr><td>u0117</td><td><%= "\u0117" %></td><td>LATIN SMALL LETTER E WITH DOT ABOVE</td></tr>
<tr><td>u0118</td><td><%= "\u0118" %></td><td>LATIN CAPITAL LETTER E WITH OGONEK</td></tr>
<tr><td>u0119</td><td><%= "\u0119" %></td><td>LATIN SMALL LETTER E WITH OGONEK</td></tr>
<tr><td>u011a</td><td><%= "\u011a" %></td><td>LATIN CAPITAL LETTER E WITH CARON</td></tr>
<tr><td>u011b</td><td><%= "\u011b" %></td><td>LATIN SMALL LETTER E WITH CARON</td></tr>
<tr><td>u011c</td><td><%= "\u011c" %></td><td>LATIN CAPITAL LETTER G WITH CIRCUMFLEX</td></tr>
<tr><td>u011d</td><td><%= "\u011d" %></td><td>LATIN SMALL LETTER G WITH CIRCUMFLEX</td></tr>
<tr><td>u011e</td><td><%= "\u011e" %></td><td>LATIN CAPITAL LETTER G WITH BREVE</td></tr>
<tr><td>u011f</td><td><%= "\u011f" %></td><td>LATIN SMALL LETTER G WITH BREVE</td></tr>
<tr><td>u0120</td><td><%= "\u0120" %></td><td>LATIN CAPITAL LETTER G WITH DOT ABOVE</td></tr>
<tr><td>u0121</td><td><%= "\u0121" %></td><td>LATIN SMALL LETTER G WITH DOT ABOVE</td></tr>
<tr><td>u0122</td><td><%= "\u0122" %></td><td>LATIN CAPITAL LETTER G WITH CEDILLA</td></tr>
<tr><td>u0123</td><td><%= "\u0123" %></td><td>LATIN SMALL LETTER G WITH CEDILLA</td></tr>
<tr><td>u0124</td><td><%= "\u0124" %></td><td>LATIN CAPITAL LETTER H WITH CIRCUMFLEX</td></tr>
<tr><td>u0125</td><td><%= "\u0125" %></td><td>LATIN SMALL LETTER H WITH CIRCUMFLEX</td></tr>
<tr><td>u0126</td><td><%= "\u0126" %></td><td>LATIN CAPITAL LETTER H WITH STROKE</td></tr>
<tr><td>u0127</td><td><%= "\u0127" %></td><td>LATIN SMALL LETTER H WITH STROKE</td></tr>
<tr><td>u0128</td><td><%= "\u0128" %></td><td>LATIN CAPITAL LETTER I WITH TILDE</td></tr>
<tr><td>u0129</td><td><%= "\u0129" %></td><td>LATIN SMALL LETTER I WITH TILDE</td></tr>
<tr><td>u012a</td><td><%= "\u012a" %></td><td>LATIN CAPITAL LETTER I WITH MACRON</td></tr>
<tr><td>u012b</td><td><%= "\u012b" %></td><td>LATIN SMALL LETTER I WITH MACRON</td></tr>
<tr><td>u012c</td><td><%= "\u012c" %></td><td>LATIN CAPITAL LETTER I WITH BREVE</td></tr>
<tr><td>u012d</td><td><%= "\u012d" %></td><td>LATIN SMALL LETTER I WITH BREVE</td></tr>
<tr><td>u012e</td><td><%= "\u012e" %></td><td>LATIN CAPITAL LETTER I WITH OGONEK</td></tr>
<tr><td>u012f</td><td><%= "\u012f" %></td><td>LATIN SMALL LETTER I WITH OGONEK</td></tr>
<tr><td>u0130</td><td><%= "\u0130" %></td><td>LATIN CAPITAL LETTER I WITH DOT ABOVE</td></tr>
<tr><td>u0131</td><td><%= "\u0131" %></td><td>LATIN SMALL LETTER DOTLESS I</td></tr>
<tr><td>u0132</td><td><%= "\u0132" %></td><td>LATIN CAPITAL LIGATURE IJ</td></tr>
<tr><td>u0133</td><td><%= "\u0133" %></td><td>LATIN SMALL LIGATURE IJ</td></tr>
<tr><td>u0134</td><td><%= "\u0134" %></td><td>LATIN CAPITAL LETTER J WITH CIRCUMFLEX</td></tr>
<tr><td>u0135</td><td><%= "\u0135" %></td><td>LATIN SMALL LETTER J WITH CIRCUMFLEX</td></tr>
<tr><td>u0136</td><td><%= "\u0136" %></td><td>LATIN CAPITAL LETTER K WITH CEDILLA</td></tr>
<tr><td>u0137</td><td><%= "\u0137" %></td><td>LATIN SMALL LETTER K WITH CEDILLA</td></tr>
<tr><td>u0138</td><td><%= "\u0138" %></td><td>LATIN SMALL LETTER KRA</td></tr>
<tr><td>u0139</td><td><%= "\u0139" %></td><td>LATIN CAPITAL LETTER L WITH ACUTE</td></tr>
<tr><td>u013a</td><td><%= "\u013a" %></td><td>LATIN SMALL LETTER L WITH ACUTE</td></tr>
<tr><td>u013b</td><td><%= "\u013b" %></td><td>LATIN CAPITAL LETTER L WITH CEDILLA</td></tr>
<tr><td>u013c</td><td><%= "\u013c" %></td><td>LATIN SMALL LETTER L WITH CEDILLA</td></tr>
<tr><td>u013d</td><td><%= "\u013d" %></td><td>LATIN CAPITAL LETTER L WITH CARON</td></tr>
<tr><td>u013e</td><td><%= "\u013e" %></td><td>LATIN SMALL LETTER L WITH CARON</td></tr>
<tr><td>u013f</td><td><%= "\u013f" %></td><td>LATIN CAPITAL LETTER L WITH MIDDLE DOT</td></tr>
<tr><td>u0140</td><td><%= "\u0140" %></td><td>LATIN SMALL LETTER L WITH MIDDLE DOT</td></tr>
<tr><td>u0141</td><td><%= "\u0141" %></td><td>LATIN CAPITAL LETTER L WITH STROKE</td></tr>
<tr><td>u0142</td><td><%= "\u0142" %></td><td>LATIN SMALL LETTER L WITH STROKE</td></tr>
<tr><td>u0143</td><td><%= "\u0143" %></td><td>LATIN CAPITAL LETTER N WITH ACUTE</td></tr>
<tr><td>u0144</td><td><%= "\u0144" %></td><td>LATIN SMALL LETTER N WITH ACUTE</td></tr>
<tr><td>u0145</td><td><%= "\u0145" %></td><td>LATIN CAPITAL LETTER N WITH CEDILLA</td></tr>
<tr><td>u0146</td><td><%= "\u0146" %></td><td>LATIN SMALL LETTER N WITH CEDILLA</td></tr>
<tr><td>u0147</td><td><%= "\u0147" %></td><td>LATIN CAPITAL LETTER N WITH CARON</td></tr>
<tr><td>u0148</td><td><%= "\u0148" %></td><td>LATIN SMALL LETTER N WITH CARON</td></tr>
<tr><td>u0149</td><td><%= "\u0149" %></td><td>LATIN SMALL LETTER N PRECEDED BY APOSTROPHE</td></tr>
<tr><td>u014a</td><td><%= "\u014a" %></td><td>LATIN CAPITAL LETTER ENG</td></tr>
<tr><td>u014b</td><td><%= "\u014b" %></td><td>LATIN SMALL LETTER ENG</td></tr>
<tr><td>u014c</td><td><%= "\u014c" %></td><td>LATIN CAPITAL LETTER O WITH MACRON</td></tr>
<tr><td>u014d</td><td><%= "\u014d" %></td><td>LATIN SMALL LETTER O WITH MACRON</td></tr>
<tr><td>u014e</td><td><%= "\u014e" %></td><td>LATIN CAPITAL LETTER O WITH BREVE</td></tr>
<tr><td>u014f</td><td><%= "\u014f" %></td><td>LATIN SMALL LETTER O WITH BREVE</td></tr>
<tr><td>u0150</td><td><%= "\u0150" %></td><td>LATIN CAPITAL LETTER O WITH DOUBLE ACUTE</td></tr>
<tr><td>u0151</td><td><%= "\u0151" %></td><td>LATIN SMALL LETTER O WITH DOUBLE ACUTE</td></tr>
<tr><td>u0152</td><td><%= "\u0152" %></td><td>LATIN CAPITAL LIGATURE OE</td></tr>
<tr><td>u0153</td><td><%= "\u0153" %></td><td>LATIN SMALL LIGATURE OE</td></tr>
<tr><td>u0154</td><td><%= "\u0154" %></td><td>LATIN CAPITAL LETTER R WITH ACUTE</td></tr>
<tr><td>u0155</td><td><%= "\u0155" %></td><td>LATIN SMALL LETTER R WITH ACUTE</td></tr>
<tr><td>u0156</td><td><%= "\u0156" %></td><td>LATIN CAPITAL LETTER R WITH CEDILLA</td></tr>
<tr><td>u0157</td><td><%= "\u0157" %></td><td>LATIN SMALL LETTER R WITH CEDILLA</td></tr>
<tr><td>u0158</td><td><%= "\u0158" %></td><td>LATIN CAPITAL LETTER R WITH CARON</td></tr>
<tr><td>u0159</td><td><%= "\u0159" %></td><td>LATIN SMALL LETTER R WITH CARON</td></tr>
<tr><td>u015a</td><td><%= "\u015a" %></td><td></td></tr>
<tr><td>u015b</td><td><%= "\u015b" %></td><td></td></tr>
<tr><td>u015c</td><td><%= "\u015c" %></td><td></td></tr>
<tr><td>u015d</td><td><%= "\u015d" %></td><td></td></tr>
<tr><td>u015e</td><td><%= "\u015e" %></td><td></td></tr>
<tr><td>u015f</td><td><%= "\u015f" %></td><td></td></tr>
<tr><td>u0160</td><td><%= "\u0160" %></td><td></td></tr>
<tr><td>u0161</td><td><%= "\u0161" %></td><td></td></tr>
<tr><td>u0162</td><td><%= "\u0162" %></td><td></td></tr>
<tr><td>u0163</td><td><%= "\u0163" %></td><td></td></tr>
<tr><td>u0164</td><td><%= "\u0164" %></td><td></td></tr>
<tr><td>u0165</td><td><%= "\u0165" %></td><td></td></tr>
<tr><td>u0166</td><td><%= "\u0166" %></td><td></td></tr>
<tr><td>u0167</td><td><%= "\u0167" %></td><td></td></tr>
<tr><td>u0168</td><td><%= "\u0168" %></td><td></td></tr>
<tr><td>u0169</td><td><%= "\u0169" %></td><td></td></tr>
<tr><td>u016a</td><td><%= "\u016a" %></td><td></td></tr>
<tr><td>u016b</td><td><%= "\u016b" %></td><td></td></tr>
<tr><td>u016c</td><td><%= "\u016c" %></td><td></td></tr>
<tr><td>u016d</td><td><%= "\u016d" %></td><td></td></tr>
<tr><td>u016e</td><td><%= "\u016e" %></td><td></td></tr>
<tr><td>u016f</td><td><%= "\u016f" %></td><td></td></tr>
<tr><td>u0170</td><td><%= "\u0170" %></td><td></td></tr>
<tr><td>u0171</td><td><%= "\u0171" %></td><td></td></tr>
<tr><td>u0172</td><td><%= "\u0172" %></td><td></td></tr>
<tr><td>u0173</td><td><%= "\u0173" %></td><td></td></tr>
<tr><td>u0174</td><td><%= "\u0174" %></td><td></td></tr>
<tr><td>u0175</td><td><%= "\u0175" %></td><td></td></tr>
<tr><td>u0176</td><td><%= "\u0176" %></td><td></td></tr>
<tr><td>u0177</td><td><%= "\u0177" %></td><td></td></tr>
<tr><td>u0178</td><td><%= "\u0178" %></td><td></td></tr>
<tr><td>u0179</td><td><%= "\u0179" %></td><td></td></tr>
<tr><td>u017a</td><td><%= "\u017a" %></td><td></td></tr>
<tr><td>u017b</td><td><%= "\u017b" %></td><td></td></tr>
<tr><td>u017c</td><td><%= "\u017c" %></td><td></td></tr>
<tr><td>u017d</td><td><%= "\u017d" %></td><td></td></tr>
<tr><td>u017e</td><td><%= "\u017e" %></td><td></td></tr>
<tr><td>u017f</td><td><%= "\u017f" %></td><td></td></tr>
</table>

<p>Test of UTF-8 encoding of the Unicode characters 0180-024F (the Latin Extended-B set)</p>
<table border="1" cellspacing="0" cellpadding="3">
<tr><td>u0180</td><td><%= "\u0180" %></td><td>LATIN SMALL LETTER B WITH STROKE</td></tr>
<tr><td>u0181</td><td><%= "\u0181" %></td><td>LATIN CAPITAL LETTER B WITH HOOK</td></tr>
<tr><td>u0182</td><td><%= "\u0182" %></td><td>LATIN CAPITAL LETTER B WITH TOPBAR</td></tr>
<tr><td>u0183</td><td><%= "\u0183" %></td><td>LATIN SMALL LETTER B WITH TOPBAR</td></tr>
<tr><td>u0184</td><td><%= "\u0184" %></td><td>LATIN CAPITAL LETTER TONE SIX</td></tr>
<tr><td>u0185</td><td><%= "\u0185" %></td><td>LATIN SMALL LETTER TONE SIX</td></tr>
<tr><td>u0186</td><td><%= "\u0186" %></td><td>LATIN CAPITAL LETTER OPEN O</td></tr>
<tr><td>u0187</td><td><%= "\u0187" %></td><td>LATIN CAPITAL LETTER C WITH HOOK</td></tr>
<tr><td>u0188</td><td><%= "\u0188" %></td><td>LATIN SMALL LETTER C WITH HOOK</td></tr>
<tr><td>u0189</td><td><%= "\u0189" %></td><td>LATIN CAPITAL LETTER AFRICAN D</td></tr>
<tr><td>u018a</td><td><%= "\u018a" %></td><td>LATIN CAPITAL LETTER D WITH HOOK</td></tr>
<tr><td>u018b</td><td><%= "\u018b" %></td><td></td></tr>
<tr><td>u018c</td><td><%= "\u018c" %></td><td></td></tr>
<tr><td>u018d</td><td><%= "\u018d" %></td><td></td></tr>
<tr><td>u018e</td><td><%= "\u018e" %></td><td></td></tr>
<tr><td>u018f</td><td><%= "\u018f" %></td><td></td></tr>
<tr><td>u0190</td><td><%= "\u0190" %></td><td></td></tr>
<tr><td>u0191</td><td><%= "\u0191" %></td><td></td></tr>
<tr><td>u0192</td><td><%= "\u0192" %></td><td></td></tr>
<tr><td>u0193</td><td><%= "\u0193" %></td><td></td></tr>
<tr><td>u0194</td><td><%= "\u0194" %></td><td></td></tr>
<tr><td>u0195</td><td><%= "\u0195" %></td><td></td></tr>
<tr><td>u0196</td><td><%= "\u0196" %></td><td></td></tr>
<tr><td>u0197</td><td><%= "\u0197" %></td><td></td></tr>
<tr><td>u0198</td><td><%= "\u0198" %></td><td></td></tr>
<tr><td>u0199</td><td><%= "\u0199" %></td><td></td></tr>
<tr><td>u019a</td><td><%= "\u019a" %></td><td></td></tr>
<tr><td>u019b</td><td><%= "\u019b" %></td><td></td></tr>
<tr><td>u019c</td><td><%= "\u019c" %></td><td></td></tr>
<tr><td>u019d</td><td><%= "\u019d" %></td><td></td></tr>
<tr><td>u019e</td><td><%= "\u019e" %></td><td></td></tr>
<tr><td>u019f</td><td><%= "\u019f" %></td><td></td></tr>
<tr><td>u01a0</td><td><%= "\u01a0" %></td><td></td></tr>
<tr><td>u01a1</td><td><%= "\u01a1" %></td><td></td></tr>
<tr><td>u01a2</td><td><%= "\u01a2" %></td><td></td></tr>
<tr><td>u01a3</td><td><%= "\u01a3" %></td><td></td></tr>
<tr><td>u01a4</td><td><%= "\u01a4" %></td><td></td></tr>
<tr><td>u01a5</td><td><%= "\u01a5" %></td><td></td></tr>
<tr><td>u01a6</td><td><%= "\u01a6" %></td><td></td></tr>
<tr><td>u01a7</td><td><%= "\u01a7" %></td><td></td></tr>
<tr><td>u01a8</td><td><%= "\u01a8" %></td><td></td></tr>
<tr><td>u01a9</td><td><%= "\u01a9" %></td><td></td></tr>
<tr><td>u01aa</td><td><%= "\u01aa" %></td><td></td></tr>
<tr><td>u01ab</td><td><%= "\u01ab" %></td><td></td></tr>
<tr><td>u01ac</td><td><%= "\u01ac" %></td><td></td></tr>
<tr><td>u01ad</td><td><%= "\u01ad" %></td><td></td></tr>
<tr><td>u01ae</td><td><%= "\u01ae" %></td><td></td></tr>
<tr><td>u01af</td><td><%= "\u01af" %></td><td></td></tr>
<tr><td>u01b0</td><td><%= "\u01b0" %></td><td></td></tr>
<tr><td>u01b1</td><td><%= "\u01b1" %></td><td></td></tr>
<tr><td>u01b2</td><td><%= "\u01b2" %></td><td></td></tr>
<tr><td>u01b3</td><td><%= "\u01b3" %></td><td></td></tr>
<tr><td>u01b4</td><td><%= "\u01b4" %></td><td></td></tr>
<tr><td>u01b5</td><td><%= "\u01b5" %></td><td></td></tr>
<tr><td>u01b6</td><td><%= "\u01b6" %></td><td></td></tr>
<tr><td>u01b7</td><td><%= "\u01b7" %></td><td></td></tr>
<tr><td>u01b8</td><td><%= "\u01b8" %></td><td></td></tr>
<tr><td>u01b9</td><td><%= "\u01b9" %></td><td></td></tr>
<tr><td>u01ba</td><td><%= "\u01ba" %></td><td></td></tr>
<tr><td>u01bb</td><td><%= "\u01bb" %></td><td></td></tr>
<tr><td>u01bc</td><td><%= "\u01bc" %></td><td></td></tr>
<tr><td>u01bd</td><td><%= "\u01bd" %></td><td></td></tr>
<tr><td>u01be</td><td><%= "\u01be" %></td><td></td></tr>
<tr><td>u01bf</td><td><%= "\u01bf" %></td><td></td></tr>
<tr><td>u01c0</td><td><%= "\u01c0" %></td><td></td></tr>
<tr><td>u01c1</td><td><%= "\u01c1" %></td><td></td></tr>
<tr><td>u01c2</td><td><%= "\u01c2" %></td><td></td></tr>
<tr><td>u01c3</td><td><%= "\u01c3" %></td><td></td></tr>
<tr><td>u01c4</td><td><%= "\u01c4" %></td><td></td></tr>
<tr><td>u01c5</td><td><%= "\u01c5" %></td><td></td></tr>
<tr><td>u01c6</td><td><%= "\u01c6" %></td><td></td></tr>
<tr><td>u01c7</td><td><%= "\u01c7" %></td><td></td></tr>
<tr><td>u01c8</td><td><%= "\u01c8" %></td><td></td></tr>
<tr><td>u01c9</td><td><%= "\u01c9" %></td><td></td></tr>
<tr><td>u01ca</td><td><%= "\u01ca" %></td><td></td></tr>
<tr><td>u01cb</td><td><%= "\u01cb" %></td><td></td></tr>
<tr><td>u01cc</td><td><%= "\u01cc" %></td><td></td></tr>
<tr><td>u01cd</td><td><%= "\u01cd" %></td><td></td></tr>
<tr><td>u01ce</td><td><%= "\u01ce" %></td><td></td></tr>
<tr><td>u01cf</td><td><%= "\u01cf" %></td><td></td></tr>
<tr><td>u01d0</td><td><%= "\u01d0" %></td><td></td></tr>
<tr><td>u01d1</td><td><%= "\u01d1" %></td><td></td></tr>
<tr><td>u01d2</td><td><%= "\u01d2" %></td><td></td></tr>
<tr><td>u01d3</td><td><%= "\u01d3" %></td><td></td></tr>
<tr><td>u01d4</td><td><%= "\u01d4" %></td><td></td></tr>
<tr><td>u01d5</td><td><%= "\u01d5" %></td><td></td></tr>
<tr><td>u01d6</td><td><%= "\u01d6" %></td><td></td></tr>
<tr><td>u01d7</td><td><%= "\u01d7" %></td><td></td></tr>
<tr><td>u01d8</td><td><%= "\u01d8" %></td><td></td></tr>
<tr><td>u01d9</td><td><%= "\u01d9" %></td><td></td></tr>
<tr><td>u01da</td><td><%= "\u01da" %></td><td></td></tr>
<tr><td>u01db</td><td><%= "\u01db" %></td><td></td></tr>
<tr><td>u01dc</td><td><%= "\u01dc" %></td><td></td></tr>
<tr><td>u01dd</td><td><%= "\u01dd" %></td><td></td></tr>
<tr><td>u01de</td><td><%= "\u01de" %></td><td></td></tr>
<tr><td>u01df</td><td><%= "\u01df" %></td><td></td></tr>
<tr><td>u01e0</td><td><%= "\u01e0" %></td><td></td></tr>
<tr><td>u01e1</td><td><%= "\u01e1" %></td><td></td></tr>
<tr><td>u01e2</td><td><%= "\u01e2" %></td><td></td></tr>
<tr><td>u01e3</td><td><%= "\u01e3" %></td><td></td></tr>
<tr><td>u01e4</td><td><%= "\u01e4" %></td><td></td></tr>
<tr><td>u01e5</td><td><%= "\u01e5" %></td><td></td></tr>
<tr><td>u01e6</td><td><%= "\u01e6" %></td><td></td></tr>
<tr><td>u01e7</td><td><%= "\u01e7" %></td><td></td></tr>
<tr><td>u01e8</td><td><%= "\u01e8" %></td><td></td></tr>
<tr><td>u01e9</td><td><%= "\u01e9" %></td><td></td></tr>
<tr><td>u01ea</td><td><%= "\u01ea" %></td><td></td></tr>
<tr><td>u01eb</td><td><%= "\u01eb" %></td><td></td></tr>
<tr><td>u01ec</td><td><%= "\u01ec" %></td><td></td></tr>
<tr><td>u01ed</td><td><%= "\u01ed" %></td><td></td></tr>
<tr><td>u01ee</td><td><%= "\u01ee" %></td><td></td></tr>
<tr><td>u01ef</td><td><%= "\u01ef" %></td><td></td></tr>
<tr><td>u01f0</td><td><%= "\u01f0" %></td><td></td></tr>
<tr><td>u01f1</td><td><%= "\u01f1" %></td><td></td></tr>
<tr><td>u01f2</td><td><%= "\u01f2" %></td><td></td></tr>
<tr><td>u01f3</td><td><%= "\u01f3" %></td><td></td></tr>
<tr><td>u01f4</td><td><%= "\u01f4" %></td><td></td></tr>
<tr><td>u01f5</td><td><%= "\u01f5" %></td><td></td></tr>
<tr><td>u01f6</td><td><%= "\u01f6" %></td><td></td></tr>
<tr><td>u01f7</td><td><%= "\u01f7" %></td><td></td></tr>
<tr><td>u01f8</td><td><%= "\u01f8" %></td><td></td></tr>
<tr><td>u01f9</td><td><%= "\u01f9" %></td><td></td></tr>
<tr><td>u01fa</td><td><%= "\u01fa" %></td><td></td></tr>
<tr><td>u01fb</td><td><%= "\u01fb" %></td><td></td></tr>
<tr><td>u01fc</td><td><%= "\u01fc" %></td><td></td></tr>
<tr><td>u01fd</td><td><%= "\u01fd" %></td><td></td></tr>
<tr><td>u01fe</td><td><%= "\u01fe" %></td><td></td></tr>
<tr><td>u01ff</td><td><%= "\u01ff" %></td><td></td></tr>
<tr><td>u0200</td><td><%= "\u0200" %></td><td></td></tr>
<tr><td>u0201</td><td><%= "\u0201" %></td><td></td></tr>
<tr><td>u0202</td><td><%= "\u0202" %></td><td></td></tr>
<tr><td>u0203</td><td><%= "\u0203" %></td><td></td></tr>
<tr><td>u0204</td><td><%= "\u0204" %></td><td></td></tr>
<tr><td>u0205</td><td><%= "\u0205" %></td><td></td></tr>
<tr><td>u0206</td><td><%= "\u0206" %></td><td></td></tr>
<tr><td>u0207</td><td><%= "\u0207" %></td><td></td></tr>
<tr><td>u0208</td><td><%= "\u0208" %></td><td></td></tr>
<tr><td>u0209</td><td><%= "\u0209" %></td><td></td></tr>
<tr><td>u020a</td><td><%= "\u020a" %></td><td></td></tr>
<tr><td>u020b</td><td><%= "\u020b" %></td><td></td></tr>
<tr><td>u020c</td><td><%= "\u020c" %></td><td></td></tr>
<tr><td>u020d</td><td><%= "\u020d" %></td><td></td></tr>
<tr><td>u020e</td><td><%= "\u020e" %></td><td></td></tr>
<tr><td>u020f</td><td><%= "\u020f" %></td><td></td></tr>
<tr><td>u0210</td><td><%= "\u0210" %></td><td></td></tr>
<tr><td>u0211</td><td><%= "\u0211" %></td><td></td></tr>
<tr><td>u0212</td><td><%= "\u0212" %></td><td></td></tr>
<tr><td>u0213</td><td><%= "\u0213" %></td><td></td></tr>
<tr><td>u0214</td><td><%= "\u0214" %></td><td></td></tr>
<tr><td>u0215</td><td><%= "\u0215" %></td><td></td></tr>
<tr><td>u0216</td><td><%= "\u0216" %></td><td></td></tr>
<tr><td>u0217</td><td><%= "\u0217" %></td><td></td></tr>
<tr><td>u0218</td><td><%= "\u0218" %></td><td></td></tr>
<tr><td>u0219</td><td><%= "\u0219" %></td><td></td></tr>
<tr><td>u021a</td><td><%= "\u021a" %></td><td></td></tr>
<tr><td>u021b</td><td><%= "\u021b" %></td><td></td></tr>
<tr><td>u021c</td><td><%= "\u021c" %></td><td></td></tr>
<tr><td>u021d</td><td><%= "\u021d" %></td><td></td></tr>
<tr><td>u021e</td><td><%= "\u021e" %></td><td></td></tr>
<tr><td>u021f</td><td><%= "\u021f" %></td><td></td></tr>
<tr><td>u0220</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0221</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0222</td><td><%= "\u0222" %></td><td></td></tr>
<tr><td>u0223</td><td><%= "\u0223" %></td><td></td></tr>
<tr><td>u0224</td><td><%= "\u0224" %></td><td></td></tr>
<tr><td>u0225</td><td><%= "\u0225" %></td><td></td></tr>
<tr><td>u0226</td><td><%= "\u0226" %></td><td></td></tr>
<tr><td>u0227</td><td><%= "\u0227" %></td><td></td></tr>
<tr><td>u0228</td><td><%= "\u0228" %></td><td></td></tr>
<tr><td>u0229</td><td><%= "\u0229" %></td><td></td></tr>
<tr><td>u022a</td><td><%= "\u022a" %></td><td></td></tr>
<tr><td>u022b</td><td><%= "\u022b" %></td><td></td></tr>
<tr><td>u022c</td><td><%= "\u022c" %></td><td></td></tr>
<tr><td>u022d</td><td><%= "\u022d" %></td><td></td></tr>
<tr><td>u022e</td><td><%= "\u022e" %></td><td></td></tr>
<tr><td>u022f</td><td><%= "\u022f" %></td><td></td></tr>
<tr><td>u0230</td><td><%= "\u0230" %></td><td></td></tr>
<tr><td>u0231</td><td><%= "\u0231" %></td><td></td></tr>
<tr><td>u0232</td><td><%= "\u0232" %></td><td></td></tr>
<tr><td>u0233</td><td><%= "\u0233" %></td><td></td></tr>
<tr><td>u0234</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0235</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0236</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0237</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0238</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0239</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u023A</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u023B</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u023C</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u023D</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u023E</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u023F</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0240</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0241</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0242</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0243</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0244</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0245</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0246</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0247</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0248</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u0249</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u024A</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u024B</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u024C</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u024D</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u024E</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
<tr><td>u024F</td><td>&nbsp;         </td><td>Unicode character not defined</td></tr>
</table>

</BODY>
</HTML>
