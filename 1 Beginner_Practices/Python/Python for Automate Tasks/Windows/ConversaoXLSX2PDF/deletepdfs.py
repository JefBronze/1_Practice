 import os

# Define the directories where the PDF files are located
directories = [
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2018/Fevereiro-18",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2018/Março-18",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2018/Abril-18",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2018/Maio-18",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2018/Junho-18",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2018/Julho-18",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2018/Agosto-18",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2018/Setembro-18",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2018/Outubro-18",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2018/Novembro-18",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2018/Dezembro-18",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Janeiro-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Fevereiro-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Março-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Abril-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Maio-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Junho-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Julho-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Agosto-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Setembro-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Outubro-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Novembro-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2019/Dezembro-2019",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Janeiro-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Fevereiro-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Março-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Abril-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Maio-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Junho-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Julho-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Agosto-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Setembro-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Outubro-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Novembro-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2020/Dezembro-2020",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Janeiro-2021",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Fevereiro-2021",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Março-2021",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Abril-2021",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Maio-2021",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Junho-2021",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Julho-2021",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Agosto-2021",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Setembro-2021",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Outubro-2021",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Novembro-2021",
    "C:/Users/Jeferson/OneDrive/Família Rauscher/Contabilidade/Prestação de Contas - Silvio/Apresentação Ministério Público - 2023/Prestação de Contas - Silvio C. R. do Canto - fev2023/2021/Dezembro-2021"
]

# Define the four-letter prefix of the PDF file name to delete
pdf_prefix = 'Reci'

# Iterate over each directory and delete the PDF file with a name that starts with the specified prefix
for directory in directories:
    for filename in os.listdir(directory):
        if filename.startswith(pdf_prefix) and filename.endswith('.pdf'):
            file_path = os.path.join(directory, filename)
            os.remove(file_path)
